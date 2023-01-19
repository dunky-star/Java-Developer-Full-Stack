/**
 * @author: Geoffrey Duncan Opiyo.
 * @since: Java 17 (2022 - 2023).
 * Java program for file systems - Lockers Pvt. Ltd.
 * Challenge. Create an interactive console program as a prototype for handling below file operations:
 * 0 - Quit application.
 * 1 - Create new file.
 * 2 - Delete/remove any file.
 * 3 - Search file.
 * Enter a number for which you want to perform operation:
 */
package com.dunky.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileMain {

    private static Scanner sc = new Scanner(System.in);
    private static boolean success = false;

    public static void main(String[] args) throws IOException {

        boolean flag = true;

       // For console interactivity.
        while(flag){
            // Calling the print method for user actions required.
            printActions();

            File file = null;
            switch(Integer.parseInt(sc.nextLine())){
                case 0 -> flag = false;
                case 1 -> addFile(null);
                case 2 -> deleteFile();
                case 3 -> searchFile();
                default -> listSortedFiles();
            }

        }
        // close Scanner to prevent resource leak
        sc.close();

    }


    // Method that creates directory and adds file to it.
    private static void addFile(File file) throws IOException {

        // Accepting input from user for directory.
        System.out.println("Please enter the directory path to create: ");
        String dir = sc.nextLine();

        // Creating the new directory if it doesn't exist.
        File directory = new File(dir);
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Directory already exists ...");
        } else {
            System.out.println("Directory not exists, creating...");
            success = directory.mkdir();
            if (success) {
                System.out.printf("Successfully created new directory : %s%n", dir);
            } else {
                System.out.printf("Failed to create new directory: %s%n", dir);
            }
        }

        // Creating new file in the directory, only if not exists
        System.out.println("Please enter the file name to be created: ");
        String filename = sc.nextLine();
        File f = new File(directory,filename);
        if (f.exists() && f.isFile()) {
            System.out.println("File already exists.");
        }else {
            System.out.println("No such file exists, creating...");
            success = f.createNewFile();
            if (success) {
                System.out.printf("Successfully created new file: %s%n", f);
            }else {
                System.out.printf("Failed to create new file: %s%n", f);
            }

        }

    }


    // Method that searches the file from the directory.
    private static void searchFile() throws IOException {
        // Accepting input from user for directory to search the file from.
        System.out.println("Please enter the directory to search the file from: ");
        String dir = sc.nextLine();

        File directory = new File(dir);
        if (directory.exists() && directory.isDirectory()) {
            // Write search logic here.
        }else {
            System.out.println("Directory not exists, try again...");
        }
        
    }

    // Method that list the file sorted from the directory.
    private static void listSortedFiles() throws IOException {

    }

    // Method that deletes the file from the directory.
    private static void deleteFile() throws IOException {

        // Accepting input from user for directory that contains the file.
        System.out.println("Please enter the directory to delete file from: ");
        String dir = sc.nextLine();

        File directory = new File(dir);
        if (directory.exists() && directory.isDirectory()) {

            // Accepting an input to delete a file in the directory, if exists.
            System.out.println("Please enter the file name to be deleted: ");
            String filename = sc.nextLine();
            File f = new File(directory,filename);
            if (f.exists() && f.isFile()) {
                success = f.delete();
                if (success) {
                    System.out.printf("File successfully deleted!: %s%n", f);
                } else {
                    System.out.printf("Failed to delete the file: %s%n", f);
                }
            } else {
                System.out.println("No such file exists, try again...");
            }
        } else {
            System.out.println("Directory not exists, try again...");
        }

    }


    // Method that displays the menu options (Taking advantage of Java textBlock feature).
    public static void printActions(){
        System.out.println("\n");
        String textBlock = """
                 Available actions:
                 0 - Quit application.
                 1 - Create new file.
                 2 - Delete/remove file.
                 3 - Search file(s).
                 Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

}


