#include<stdio.h>

//swapping position of two elements
void swap(int *a, int *b){
     int temp = *a;
     *a = *b;
     *b = temp;
}

void selectionSort(int array[], int size){
     for(int step = 0; step<size-1; step++){
          int min_idx = step;
          for(int i = step+1; i<size; i++){
               if(array[i]<array[min_idx])
                    min_idx = i;
          }
          swap(&array[step], &array[min_idx]);
     }
}

//Function for print an array

void printArray(int array[], int size){
     for(int i = 0; i<size; i++){
          printf("%d ",array[i]);
     }
     printf("\n");
}

int main(){
     int data[] = {10, 15, 5, 9, 2, 8};
     int size = sizeof(data)/sizeof(data[0]);
     selectionSort(data,size);
     printf("Sorted array is:- \n");
     printArray(data, size);
}
