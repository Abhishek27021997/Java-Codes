import java.util.*;

public class IndexFinder {
    public static int findIndex(int[] A) {
        return findIndexHelper(A, 0, A.length - 1);
    }

    private static int findIndexHelper(int[] A, int start, int end) {
        if (start > end) {
            return -1; // Base case: no such index found
        }

        int mid = (start + end) / 2;

        if (A[mid] == mid) {
            return mid; // Found index i where A[i] = i
        } else if (A[mid] < mid) {
            return findIndexHelper(A, mid + 1, end); // Look in the right half
        } else {
            return findIndexHelper(A, start, mid - 1); // Look in the left half
        }
    }
      
    public static void main(String[] args) {
        int[] array = {-5, -2, 0, 2, 4, 6, 8}; // Example array
        int index = findIndex(array);

        if (index != -1) {
            System.out.println("Index " + index + " found where A[" + index + "] = " + array[index]);
        } else {
            System.out.println("No such index found.");
        }
    }
}
