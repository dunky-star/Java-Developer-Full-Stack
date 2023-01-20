/**
 * @author: Geoffrey Duncan Opiyo.
 * @since: Java 17 (2022 - 2023).
 * Java program for file systems - Lockers Pvt. Ltd.
 * Challenge. Create an interactive console program as a prototype for handling below file operations:
 * 0 - Quit application.
 * 1 - Display all files.
 * 2 - Create new file.
 * 3 - Delete/remove any file.
 * 4 - Search file.
 * Enter a number for which you want to perform operation:
 */
package com.dunky.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;


public class FileMain {

    private static final Scanner sc = new Scanner(System.in);
    private static boolean success = false;

    public static void main(String[] args) throws IOException {
       try {
           boolean flag = true;

           // For console interactivity.
           while (flag) {
               // Calling the print method for user actions required.
               printActions();

               File file = null;
               switch (Integer.parseInt(sc.nextLine())) {
                   case 1 -> listSortedFiles();
                   case 2 -> addFile(null);
                   case 3 -> deleteFile();
                   case 4 -> searchFile();
                   default -> flag = false;
               }

           }
       }catch (Exception e) {
           e.getStackTrace();
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

            // Accepting an input to search a file in the directory, if exists.
            System.out.println("Please enter the file name you want to search: ");
            String filename = sc.nextLine();
            File fileToSearch = new File(directory,filename);
            // Store the files inside the directory in an ArrayList data structure.
            ArrayList<File> fileList = new ArrayList<>();
            File[] fileArray = directory.listFiles();
            assert fileArray != null;
            for (File file : fileArray) {
                if (file.isFile()) {
                    // adding individual file to ArrayList<> fileList.
                    fileList.add(new File(file.getName()));
                }
            }
            // Calling linear search function to search the file.
            int result = linearSearchAlgo(fileList, fileToSearch);
            print (fileToSearch , result);

        }else {
            System.out.println("Directory not exists, try again...");
        }

    }

    /**
     * Creating the search function.
     * Applications: Linear Search can be used for searching in a small and unsorted
     * set of data which is guaranteed not to increase in size by much.
     * Due to its linear increase in time complexity, it does not find application in many production systems
     * Task: Search a particular file in a given array.
     */
    private static int linearSearchAlgo(ArrayList<File> fileList, File elementToSearch){
        if (fileList == null || fileList.size() == 0){
            return -1;
        }
        if (elementToSearch == null){
            return -1;
        }
        for (int i = 0; i < fileList.size(); i++){
            if (fileList.get(i).getName().equals(elementToSearch.getName())){
                return i;
            }

        }
        return -1;
    }

    // Helper function to print file search results.
    private static void print(File fileFound, int result){
        if (result == -1){
            System.out.println(fileFound + " not found.");
        }else{
            System.out.println(fileFound + " found at index: " + result);
        }

    }

    // Method that list the file sorted from the directory.
    private static void listSortedFiles() throws IOException {
        // Accepting input from user for directory to search the file from.
        System.out.println("Please enter the directory to list all the files from: ");
        String dir = sc.nextLine();

        File directory = new File(dir);
        if (directory.exists() && directory.isDirectory()) {
            // To store the files inside the directory in an Array.
            File[] fileArray = directory.listFiles();

            System.out.println(
                    "**********************************************");
            System.out.println(
                    "Files from the directory : " + directory);
            System.out.println(
                    "**********************************************");

            assert fileArray != null;
            for (File file : fileArray) {
                BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                if (attr.isRegularFile()) {
                    System.out.println(file.getName() + " Last modified time " + attr.lastModifiedTime());
                } else if (attr.isDirectory()) {
                    System.out.println("Directory " + file.getName() + " Last modified time " + attr.lastModifiedTime());
                }
            }

        } else {
            System.out.println("Directory not exists, try again...");
        }

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
        System.out.println("-".repeat(33));
        System.out.println("Developer: Geoffrey Duncan Opiyo");
        System.out.println("Company Lockers Pvt. Ltd.");
        System.out.println("-".repeat(33));

        String textBlock = """
                
                AVAILABLE ACTIONS:
                ==================
                0 - Quit application.
                1 - Display all files.
                2 - Create new file.
                3 - Delete/remove any file.
                4 - Search file(s).
                              
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

}


