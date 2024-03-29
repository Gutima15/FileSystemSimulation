/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystemsimulation;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @authors Jorge Gutiérrez, Luis Adrián Badilla
 * @Reference Source Bazlur Rahman Rokon (31/3/17)
 * @Original at: https://gist.github.com/rokon12/d3c83562c785de6d1a483a5585205b92
 * @Updated 8/12/2020
 */
public abstract class FileSystemNode implements Comparable<FileSystemNode> {
    private FileSystemDirectory root;
    private String name;
    private LocalDateTime created;
    private LocalDateTime lastUpdated;
    private LocalDateTime lastAccessed;
    private int size;
    public List<Integer> listOfInicialIndices;

    public FileSystemNode(String name) {
        this.name = name;
        this.created = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
        this.lastAccessed = LocalDateTime.now();                
    }
    
    public void setNodeName (String name){
    this.name = name;
}
    public void setListOfIndices(List<Integer> indices){
        listOfInicialIndices = indices;
    }
    
    public void setSize(int fileSize){
        size = fileSize;
    }

    public boolean isDirectory() {

        return this instanceof FileSystemDirectory;
    }

    public String getPath() {

        return root != null ? root.getPath() + "/" + name : name;
    }

    public FileSystemNode getParent() {
        return root;
    }

    public abstract long getLength();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(FileSystemNode o) {

        return this.getName().compareTo(o.getName());
    }

    public void setRoot(FileSystemDirectory root) {
        this.root = root;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public LocalDateTime getLastAccessed() {
        return lastAccessed;
    }

    @Override
    public String toString() {
        String result = "";
        if(!isDirectory()){
            result = "Route: " + root.getPath() +
                "\nFile name: '" + name + '\'' +
                "\nCreated: " + created +
                "\nLast Updated: " + lastUpdated +
                "\nLast Accessed: " + lastAccessed +
                "\nSize: " + size + " Bytes";
        }
        return result;
    }
}
