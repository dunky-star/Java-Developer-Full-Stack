/**
 * Linear Search Algorithm
 */
public class LinearSearchInt {
    public static int LinearSearchAlgo(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {

    }


}
