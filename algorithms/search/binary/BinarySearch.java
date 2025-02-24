package algorithms.search.binary;
import java.util.Scanner;

public class BinarySearch {

    public static int[] array = {1,22,33,44,55,66,77,88,99,100,211};

    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        int index = -1;
        while (left <= right){
            int middle = left + (right - left) /2;
            if (array[middle] == target) {
                index = middle;
                break;
            }if(array[middle] < target){ 
                left = middle + 1;
            }else{ //arr[middle] > target
                right = middle -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to search:");
        System.out.println("Index: "+binarySearch(array, scan.nextInt()));
        scan.close();
    }
}
