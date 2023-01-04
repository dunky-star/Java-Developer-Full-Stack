package StringOptions;

public class Main {
    public static void main(String[] args){

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder stringBuilder = new StringBuilder("Hello" + " World");
        stringBuilder.append(" and Goodbye");
        stringBuilder.deleteCharAt(4).insert(9,"d");

        StringBuilder emptyBuilder = new StringBuilder();
        emptyBuilder.append("a".repeat(17));

        // Call the methods onto these variables.
        printInformation(helloWorld);
        printInformation(stringBuilder);
        printInformation(emptyBuilder);

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
