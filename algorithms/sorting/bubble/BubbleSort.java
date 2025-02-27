package algorithms.sorting.bubble;

class BubbleSort {

        public static void bubbleSort(int[] arr){
            int l = arr.length - 1;
            Boolean swapped = false;
            while (swapped == true || l > 0) {
                swapped = false;
                for (int i = 0; i < l; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int tmp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = tmp;
                        swapped = true;
                    }
                }
                l = l - 1;
            }
        }

        public static void main(String[] args) {
            int[] arr = {0, -3, -3, 54, 1, 22,-100, 22};
            System.out.println("Array to sort: ");
            for (int n : arr) {
                System.out.print(n + " ");
            }
            bubbleSort(arr);
            System.out.println("\nSorted Array:");
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }
    }
    