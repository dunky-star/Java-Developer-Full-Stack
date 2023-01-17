import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        boolean success = false;

        // Accepting input from user for directory.
        System.out.println("Please enter the directory path to create: ");
        String dir = sc.nextLine();

        // Creating the new directory if it doesn't exists.
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

        // close Scanner to prevent resource leak reader.close();
        sc.close();
    }

}


