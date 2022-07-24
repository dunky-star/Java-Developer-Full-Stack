/**
 * Linear Search Algorithm
 * =======================
 * Linear Search involves sequential searching for an element in the given data structure until
 * either the element is found or the end of the structure is reached.
 * If the element is found, we usually just return its position in the data structure.
 * If not, we usually return -1.
 */
public class LinearSearchInt {
    public static int LinearSearchAlgo(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
    // A simple helper method to print search output.
    public static void print(int elementToSearch, int index){
        if(index == -1){
            System.out.println(elementToSearch + " not found");
        }else{
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }


    public static void main(String[] args) {
        int intArr[] = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        int index = LinearSearchAlgo(intArr, 99); // Function call for search.
        print(99, index); // function call to print the search result.
    }
}
