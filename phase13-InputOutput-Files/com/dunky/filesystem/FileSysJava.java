package com.dunky.filesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSysJava {
    public static void main(String[] args){

        Path filePath = Paths.get("D:\\", "Examples", "file1.txt");

        // Copying file from one directory to another.
        try {
            System.out.println("File created is: " + Files.createFile(filePath));     //creates file at specified location.
            Path sourceFile = FileSystems.getDefault().getPath("D:\\", "Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("D:\\", "Examples", "file1copy.txt");
            Files.copy(sourceFile, copyFile);
        } catch(IOException e) {
            e.printStackTrace();
        }

//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//        // Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//        Path filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
//        printFile(filePath);
//
//        filePath = Paths.get("D:\\", "Examples", "OutThere.txt");
//        // D:\\Examples\\OutThere.txt
//        printFile(filePath);
//
//        // Getting and displaying file path.
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        // Checking if files/directory exist.
//        Path filePathCheck = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));

    }

    // Reading content of a file.
    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
