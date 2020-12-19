/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystemsimulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Utilities {
    
    public String deleteFileInMemory(String memory, List<Integer> emptyIndices, int lineLenght ){
        for(int i = 0 ; i<emptyIndices.size(); i++){  
            String previousPart = memory.substring(0,emptyIndices.get(i));             //"_____"
            String middlePart = "";
            String secondPart = memory.substring(emptyIndices.get(i)+lineLenght-1,memory.length());//"\nramas\ncasa_\n_____\n_____\n"
            for(int j = emptyIndices.get(i); j<emptyIndices.get(i)+lineLenght-1; j++){                
                middlePart = middlePart.concat("_");                                                                         
            }                        
            memory= previousPart.concat( middlePart.concat(secondPart) );     
        }
        return memory;
    }
    
    public String addFileToMemory(String memory, String contenido, List<Integer> emptyIndices, int lineLenght ){
        for(int i = 0 ; i<emptyIndices.size(); i++){  
            String previousPart = memory.substring(0,emptyIndices.get(i));             //"_____"
            String middlePart = "";
            String secondPart = memory.substring(emptyIndices.get(i)+lineLenght-1,memory.length());//"\n_____\ncasa_\n_____\n_____\n"
            for(int j = emptyIndices.get(i); j<emptyIndices.get(i)+lineLenght-1 && contenido.length()>0; j++){                
                middlePart = middlePart.concat(Character.toString(contenido.charAt(0)));                                                
                contenido = contenido.substring(1, contenido.length());
            }          
            String middleFixed = "";
            for(int k=0; k<(lineLenght-1)-middlePart.length(); k++){ 
                middleFixed = middleFixed.concat("_");
            }            
            middlePart = middlePart.concat(middleFixed);
            memory= previousPart.concat( middlePart.concat(secondPart) );     
        }
        return memory;
    }
    
    public String memoryToString(String memory, List<Integer> fillIndices, int lineLenght ){
        String result = "";
        for(int i = 0 ; i<fillIndices.size(); i++){              
            String middlePart = memory.substring(fillIndices.get(i) , fillIndices.get(i)+lineLenght-1);            
            result = result.concat(middlePart);            
        }
        return result;
    }
    
    public FileSystemDirectory moveUp(FileSystemDirectory actual){
        while(actual.getParent()!= null){
            actual = (FileSystemDirectory) actual.getParent();
        }
        return actual;
    }
    
    public FileSystemDirectory moveDown (List<String> list, FileSystemDirectory actual){  
        if (list.isEmpty()){
            return actual;
        }else{
            for(FileSystemNode n:actual.getNodes()){                
                if(n.getName().equals(list.get(0))){
                    actual = (FileSystemDirectory) n;
                    list.remove(0);
                    actual = moveDown(list, actual);
                    break;
                }else{
                    actual = null;
                }                     
            }
        }
        return actual;
    }
    public FileSystemDirectory move(List<String> routeL, FileSystemDirectory tree, JFrame ventana){
        List<String> routeList = new ArrayList<String>(routeL);        
        if(routeList.get(0).equals("root") && routeList.size()==1 && tree.getName().equals("root")){
            JOptionPane.showMessageDialog(ventana, "You're already in " + tree.getPath());
        }else{
            FileSystemDirectory tempTree = tree;
            tree = moveUp(tree); //Voy a root
            if(routeList.get(0).equals("root") && routeList.size()==1){
                JOptionPane.showMessageDialog(ventana, "Success in moving to " + tree.getPath());
            }else{      
                routeL.remove(0);
                tree = moveDown(routeL,tree);
                if(tree == null){
                    tree = tempTree;
                    JOptionPane.showMessageDialog(ventana, "Route not found");
                }else{
                    JOptionPane.showMessageDialog(ventana, "Success in moving to " + tree.getPath());                                                                  
                }                
            }            
        }
        return tree;
    }
    
    public FileSystemDirectory moveDelete(List<String> routeL, FileSystemDirectory tree){
        List<String> routeList = new ArrayList<String>(routeL);        
        FileSystemDirectory tempTree = tree;
        tree = moveUp(tree); //Voy a root
        routeL.remove(0);
        tree = moveDown(routeL,tree);
        if(tree == null){
            tree = tempTree;
        }                                         
        return tree;
    }
    
    public FileSystemDirectory deleteLogicDirFile(FileSystemNode dirFile, FileSystemDirectory root, Iterator<FileSystemNode> iterator){
        if(root.getNodes().isEmpty()){
            return root;
        }else{
            if(!dirFile.isDirectory()){ //FILES                
                iterator.remove(); 
                return root;
            }else{
                FileSystemDirectory tempDir = (FileSystemDirectory) dirFile;
                String [] route = dirFile.getPath().split("/");
                List<String> nodeList = new ArrayList<String>();
                for(String dir: route){
                    nodeList.add(dir);
                }
                root = moveDelete(nodeList, root);
                iterator = tempDir.getNodes().iterator();               
                while(iterator.hasNext()){                    
                    FileSystemNode node = iterator.next();
                    if(!node.isDirectory()){
                        root = deleteLogicDirFile(node, root, iterator);
                    }else{
                        root= deleteLogicDirFile(node, root, iterator);
                        iterator.remove();
                    }
                }
            }        
        }
        return root;
    }
    
    public void removeDiscFile(FileSystemFile file){
        //removeLocalFile                
        String memory = loadDisc();
        int lineLenght = lineLenght();
        String result = deleteFileInMemory(memory, file.listOfInicialIndices, lineLenght);
        WriteDisc(result);                                
    }
    
    public boolean fileExistOnDirectory(FileSystemDirectory actual, String pathToSerch, String fileName){
        boolean result = false;
        String[] route = pathToSerch.split("/");
        List<String> list;  
        list = new ArrayList<String>();
        for(int i = 0; i< route.length; i++){
            list.add(route[i]);
        }
        FileSystemDirectory tempTree = actual;
        tempTree = moveUp(actual); //Voy a root
        list.remove(0);
        tempTree = moveDown(list,tempTree);
        if(tempTree==null){ //NO ESTA EL DIR
            result = false;
        } else {
            for(FileSystemNode f: tempTree.getNodes()){
                if(!f.isDirectory()){ //SOLO ARCHIVOS
                    if(f.getName().equals(fileName)){
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
     
    public boolean directoryExist(FileSystemDirectory actual, String pathToSerch){
        boolean result = false;
        String[] route = pathToSerch.split("/");
        List<String> list;  
        list = new ArrayList<String>();
        for(int i = 0; i< route.length; i++){
            list.add(route[i]);
        }
        FileSystemDirectory tempTree = actual;
        tempTree = moveUp(actual); //Voy a root
        list.remove(0);
        tempTree = moveDown(list,tempTree);
        if(tempTree!=null){ //NO ESTA EL DIR
            result = true;  
        }
        return result;
    }
    
    public int lineLenght(){
         File file = new File("./disc.txt");
         int lineaLen = -1;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Window_Virtual_Disc_Creation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                
        try {            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);            
            lineaLen = br.readLine().length()+1;
            br.close();            
              
        } catch (IOException ex) {
            Logger.getLogger(Window_Virtual_Disc_Creation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineaLen;
    }
    
    public String getFileContent(File file){   
        String line = "";
        try {                        
            Scanner myReader = new Scanner(file);           
            while(myReader.hasNextLine()){
                line = line.concat(myReader.nextLine()+"\n");                
            }
            myReader.close();
            
            return line;              
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }        
        return line;
    }
    
    public String loadDisc(){   
        String oldLine = "";
        try {            
            File file = new File("./disc.txt");      
            Scanner myReader = new Scanner(file);           
            while(myReader.hasNextLine()){
                oldLine = oldLine.concat(myReader.nextLine()+"\n");                
            }
            myReader.close();
            
            return oldLine;              
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
        System.out.println(oldLine);
        return oldLine;
    }
    //, read(Load), update, delete
    public void WriteDisc(String memory){
        File file = new File("./disc.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Window_Virtual_Disc_Creation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(memory);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Window_Virtual_Disc_Creation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getValidEmptySequential(String disc, int lineasNecesaria, int largoLinea){
        int emptyLines=0;
        int index=-1;
        for(int i = 0; i< disc.length()&& emptyLines<lineasNecesaria ; i+=largoLinea){
            char firstCharLine =disc.charAt(i);
            if(emptyLines==0){
                index = i;
            }
            if(firstCharLine=='_'){
                emptyLines++;
            }else{
                emptyLines=0;
            }
        }
        if(emptyLines < lineasNecesaria){
            index = -1;
        }
        return index;
    }
          
    public List<Integer> getValidEmptyIndexed(String disc, int lineasNecesaria, int largoLinea){
        String var= "_____\nramas\ncasa_\n_____\n_____\n";
        int emptyLines=0;
        List<Integer> fileIndices = new ArrayList<Integer>();        
        for(int i = 0; i< disc.length()&& emptyLines<lineasNecesaria ; i+=largoLinea){
            char firstCharLine =disc.charAt(i);            
            if(firstCharLine=='_'){
                emptyLines++;
                fileIndices.add(i);
            }
        }
        if(emptyLines < lineasNecesaria){
            return null;
        }
        return fileIndices;
    }

}
