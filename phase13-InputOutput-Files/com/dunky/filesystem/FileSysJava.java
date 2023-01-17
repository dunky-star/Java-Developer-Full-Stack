package com.dunky.filesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSysJava {
    public static void main(String[] args){

        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

        // Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
        Path filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
        printFile(filePath);

        filePath = Paths.get("D:\\", "Examples", "OutThere.txt");
        // D:\\Examples\\OutThere.txt
        printFile(filePath);

        // Getting and displaying file path.
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        // Checking if files/directory exist.
        Path filePathCheck = FileSystems.getDefault().getPath("files");
        System.out.println("Exists = " + Files.exists(filePath));

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
