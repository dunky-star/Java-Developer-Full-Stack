import java.io.File;
import java.util.ArrayList;

/**
 * Applications: Linear Search can be used for searching in a small and unsorted
 * set of data which is guaranteed not to increase in size by much.
 * Due to its linear increase in time complexity, it does not find application in many production systems
 * Task: Search a particular file in a given array.
 */
public class LinearSearchStr {

    public static void main(String[] args){
        ArrayList<File> fileList = new ArrayList<>();
        fileList.add(new File("1.txt"));
        fileList.add(new File("2.txt"));
        fileList.add(new File("3.txt"));
        fileList.add(new File("4.txt"));
        fileList.add(new File("6.txt"));
        fileList.add(new File("5.txt"));

    }


}
