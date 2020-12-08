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
public class FileSystemSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileSystemDirectory root;
        root = new FileSystemDirectory("root");
        FileSystemFile file = new FileSystemFile("profile.jpg");
        root.add(file);

        FileSystemDirectory movie = new FileSystemDirectory("movie");
        root.add(movie);

        FileSystemDirectory englishMovie = new FileSystemDirectory("english");

        englishMovie.add(new FileSystemDirectory("IronFist.mp4"));
        englishMovie.add(new FileSystemDirectory("The Shawshank Redemption.mp4"));
        englishMovie.add(new FileSystemDirectory("ZotaPia.mp4"));
        FileSystemFile despicableMe = new FileSystemFile("DespicableMe.mp4");
        englishMovie.add(despicableMe);
        movie.add(englishMovie);

        FileSystemDirectory banglaMovie = new FileSystemDirectory("Bangla");
        banglaMovie.add(new FileSystemFile("The Clay Bird.mp4"));
        banglaMovie.add(new FileSystemFile("Jibon Thekey Neya.mp4"));

        movie.add(banglaMovie);

        root.printTree();

        System.out.println("name: " + movie.getName());
        System.out.println("Created: " + movie.getCreated());
    }
    
}
