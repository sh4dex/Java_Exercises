#include <stdio.h>

void insertion_sort(int arr[], int length);

int main(){
    int a[] = {-3,2,-1,54,0,200,1,-100};
    printf("Array to sort:\n");
    int length = sizeof(a) / 4;
    for(int i=0; i<length; i++){
      printf("%d\t", a[i]);
    }
    printf("\n");
    int temp;

    for (int i = 1; i<length; i++){
      int j = i;
      //while( j>0 && a[j-1] < a[j]){ for increasing order
      while( j>0 && a[j]< a[j-1]){
        temp=a[j-1];
        a[j-1]=a[j];
        a[j]=temp;
        j--;
      }
    }

    printf("Sorted Array:\n");
    for(int i=0; i<length; i++){
      printf("%d\t", a[i]);
    }
    return 0;
}
