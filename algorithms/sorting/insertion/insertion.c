#include <stdio.h>


int a[] = {-3,2,-1,54,0,200,1,-100};
int length = sizeof(a) / 4;

void insertion_sort(int a[]){
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
}

void printArrln(int arr[]){
  for(int i=0; i<length; i++){
    printf("%d\t", a[i]);
  }
  printf("\n");
}

int main(){
    printf("Array to sort:\n");
    printArrln(a);
    insertion_sort(a);
    printf("Sorted Array:\n");
    printArrln(a); 
    return 0;
}
