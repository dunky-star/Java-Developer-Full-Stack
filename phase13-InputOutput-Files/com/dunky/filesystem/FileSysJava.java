package com.dunky.filesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class FileSysJava {
    public static void main(String[] args){

        Path filePath = Paths.get("D:\\", "Examples", "file1.txt");



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

    private static void deleteFile(Path path) {
        try {
            // Deleting a file
            Path fileToDelete = FileSystems.getDefault().getPath("D:\\", "Examples", "file1copy.txt");
            Files.deleteIfExists(fileToDelete);

        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void moveFile(Path path) {
        try {
            // Moving a file
            Path fileToMove = FileSystems.getDefault().getPath("D:\\", "Examples", "file1copy.txt");
            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1","file1copy.txt");
            Files.move(fileToMove, destination);

        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createFile(Path path) {
        Path filePath = Paths.get("D:\\", "Examples", "file1.txt");
        try {
            System.out.println("File created is: " + Files.createFile(filePath));     //creates file at specified location.
            // Copying file from one directory to another.
            Path sourceFile = FileSystems.getDefault().getPath("D:\\", "Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("D:\\", "Examples", "file1copy.txt");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
