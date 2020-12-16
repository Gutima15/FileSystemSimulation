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
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            String secondPart = memory.substring(emptyIndices.get(i)+lineLenght-1,memory.length());//"\nramas\ncasa_\n_____\n_____\n"
            for(int j = emptyIndices.get(i); j<emptyIndices.get(i)+lineLenght-1 && contenido.length()>0; j++){                
                middlePart = middlePart.concat(Character.toString(contenido.charAt(0)));                                                
                contenido = contenido.substring(1, contenido.length());                
            }            
            for(int k=0; k<(lineLenght-1)-middlePart.length(); k++){
                middlePart = middlePart.concat("_");
            }            
            memory= previousPart.concat( middlePart.concat(secondPart) );     
        }
        return memory;
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
    
    public String loadDisc(){   
        String oldLine = "";
        try {            
            File file = new File("./disc.txt");      
            Scanner myReader = new Scanner(file);           
            String linea;
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
    
    public List<Integer> getValidEmptyIdexed(String disc, int lineasNecesaria, int largoLinea){
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
