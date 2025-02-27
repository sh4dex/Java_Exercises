package algorithms.sorting.insertion;

public class InsertionSort {
    
    public static void insertionSort(int[] arr){
        boolean sorted = false;
        int temp;
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j > 0 && sorted==false){
                if (arr[j] < arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    sorted = true;
                }
                j--;
            }
            sorted = false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 3, 54, 1, 1,20, 22, 22};
        System.out.println("Array to sort: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        insertionSort(arr);
        System.out.println("\nSorted Array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
