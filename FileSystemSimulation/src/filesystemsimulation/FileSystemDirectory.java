package filesystemsimulation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import java.util.TreeSet;

/**
 * @authors Jorge Gutiérrez, Luis Adrián Badilla
 * @Reference Source Bazlur Rahman Rokon (31/3/17)
 * @Original at: https://gist.github.com/rokon12/d3c83562c785de6d1a483a5585205b92
 * @Updated 8/12/2020
 */
public class FileSystemDirectory extends FileSystemNode {
    private Set<FileSystemNode> nodes;

    public FileSystemDirectory(String path) {
        super(path);
        nodes = new TreeSet<>();
    }

    public void add(FileSystemNode node) {
        node.setRoot(this);
        nodes.add(node);
    }

    public Set<FileSystemNode> getNodes() {
        return nodes;
    }

    public long getLength() {
        long length = 0;
        for (FileSystemNode node : nodes) {
            length += node.getLength();
        }
        return length;
    }

    public void printTree() {
        int indent = 0;
        StringBuilder sb = new StringBuilder();
        printDirectoryTree(this, indent, sb);
        System.out.println(sb.toString());
    }

    public void printDirectoryTree(FileSystemNode node, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(node.getName());
        sb.append("/");
        sb.append("\n");

        if (node.isDirectory()) {
            FileSystemDirectory directory = (FileSystemDirectory) node;
            for (FileSystemNode file : directory.getNodes()) {
                printDirectoryTree(file, indent + 1, sb);
            }
        }
    }

    private static String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        return sb.toString();
    }
}