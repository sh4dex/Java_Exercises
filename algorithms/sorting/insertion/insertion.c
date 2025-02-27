#include <stdio.h>

void insertion_sort(int arr[], int length);

int main(){
    int a[] = {3,2,1,5,4};
    int length = sizeof(a) / 4;
    int temp;

    for (int i = 1; i<length; i+=){
      int j = i;
      while( j>0 && a[j-1] < a[j]){
        //TODO: Finish algo
      }
      j--;
    }
    printf("%d\n", length);
    return 0;
}
