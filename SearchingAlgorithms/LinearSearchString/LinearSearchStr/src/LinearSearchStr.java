import java.io.File;
import java.util.ArrayList;

/**
 * Applications: Linear Search can be used for searching in a small and unsorted
 * set of data which is guaranteed not to increase in size by much.
 * Due to its linear increase in time complexity, it does not find application in many production systems
 * Task: Search a particular file in a given array.
 */
public class LinearSearchStr {
    // Creating search function
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

    // Helper function to print search result.
    private static void print(File fileFound, int result){
        if (result == -1){
            System.out.println(fileFound + " not found.");
        }else{
            System.out.println(fileFound + " found at index: " + result);
        }

    }

    public static void main(String[] args){
        ArrayList<File> fileList = new ArrayList<>();
        fileList.add(new File("1.txt"));
        fileList.add(new File("2.txt"));
        fileList.add(new File("3.txt"));
        fileList.add(new File("4.txt"));
        fileList.add(new File("6.txt"));
        fileList.add(new File("5.txt"));

        //
        File fileToSearch = new File("3.txt");
        int result = linearSearchAlgo(fileList, fileToSearch);
        print (new File("3.txt"), result);
    }


}
