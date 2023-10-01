
public class SelectionSort {
    public static void selectionSort(int[] A, int n) {
        for(int i = 0; i < n - 1; i++) {
            int largest = i;
            for(int j = i+1; j < n; j++) {
                if(A[j] > A[largest]) {
                    largest = j;
                }
            }
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] A = {5, 4, 3, 2, 1};
        selectionSort(A, n);
        for(int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
