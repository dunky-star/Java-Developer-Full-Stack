package StringOptions;

public class Main {
    public static void main(String[] args){

        String helloWorld = "Hello" + "World";

        StringBuilder stringBuilder = new StringBuilder("Hello" + "World");

        // Call the methods onto these variables.
        printInformation(helloWorld);
        printInformation(stringBuilder);

    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("String Builder = " + builder);
        System.out.println("Length = " + builder.length());
    }
}
