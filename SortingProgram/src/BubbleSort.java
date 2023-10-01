
public class BubbleSort {
    public static void bubbleSort(int[] A, int n) {
        for(int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }
            // If no swap occurred, array is already sorted
            if(!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] A = {5, 4, 3, 2, 1};
        bubbleSort(A, n);
        System.out.print("The Buuble sort is: " );
        for(int i = 0; i < n; i++) {
            System.out.print(+A[i] + " ");
        }
    }
}
