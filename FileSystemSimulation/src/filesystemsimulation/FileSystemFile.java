/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystemsimulation;

/**
 * @authors Jorge Gutiérrez, Luis Adrián Badilla
 * @Reference Source Bazlur Rahman Rokon (31/3/17)
 * @Original at: https://gist.github.com/rokon12/d3c83562c785de6d1a483a5585205b92
 * @Updated 8/12/2020
 */
public class FileSystemFile extends FileSystemNode {
    private String content; /// for simplicity

    public FileSystemFile(String name, String content) {
        super(name);
        this.content = content;
    }

    public FileSystemFile(String name) {
        super(name);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public long getLength() {
        if (content != null) {
            return content.getBytes().length;
        }

        return 0;
    }
}