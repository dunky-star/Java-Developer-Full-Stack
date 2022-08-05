/**
 * @author: Geoffrey Duncan Opiyo.
 * @since: Java 17 (2022).
* EXERCISE: Create an array of objects of the Student class, of size 10
* Create 10 objects of the Student class, with values, and assign the objects to the array.
* Loop through the array and print the name, age, and roll number of all students:
*/
class Students {
    private String name;
    private int age;
    private String rollNum;

    public Students(String name, int age, String rollNum) {

        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    public String toString() {

        return name + " " + age + " " + rollNum;
    }

}

public class ArrayStudents{

    public static void main(String[] args) {
        Students[] s = new Students[10];// Array of objects Students of size 10.

        s[0] = new Students("KaligsXcross", 3, "p001");
        s[1] = new Students("Subi", 4, "p002");
        s[2] = new Students("Duncan", 5, "p003");
        s[3] = new Students("puppy", 6, "p004");
        s[4] = new Students("mummy", 7, "p005");
        s[5] = new Students("Dunny", 8, "p006");
        s[6] = new Students("Clip", 15, "p007");
        s[7] = new Students("Geoffrey", 10, "p008");
        s[8] = new Students("Arma", 5, "p009");
        s[9] = new Students("Granny", 9, "p010");

        System.out.print("Name  Age  Roll No. \n");
        System.out.println("==================");
        for (int i = 0; i < s.length; ++i) {
            System.out.println(s[i].toString());
        }
    }

}

