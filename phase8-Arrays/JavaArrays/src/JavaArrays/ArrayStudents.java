package JavaArrays;
/**
 * @author: Geoffrey Duncan Opiyo.
 * @since: Java 17 (2022).
 * EXERCISE: Create an array of objects of the Student class, of size 10
 * Create 10 objects of the Student class, with values, and assign the objects to the array.
 * Loop through the array and print the name, age, and roll number of all students:
 */
class Students{
    private String name;
    private int age;
    private String rollNum;

    Students(String name, int age, String rollNum){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    public String toString(){
        return name + "  " + age + "  " + rollNum + "  ";
    }
}

public class ArrayStudents{
    public static void main(String[] args){

        // Create an array of student object.
        Students[] s = new Students[10];
        s[0] = new Students("Dunky", 20, "p030");
        s[1] = new Students("Kaligs", 30, "p030");
        s[2] = new Students("Arma", 2, "p002");
        s[3] = new Students("Dues", 35, "p035");
        s[4] = new Students("Sheen", 25, "p025");
        s[5] = new Students("Anjana", 27, "p027");
        s[6] = new Students("Ankit", 33, "p033");
        s[7] = new Students("Mario", 35, "p035");
        s[8] = new Students("Muhangi", 40, "p040");
        s[9] = new Students("Philo", 32, "p032");

        System.out.println("Name  Age  RollNo.");
        System.out.println("==================");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i].toString());
        }

    }

}





