#include<stdio.h>
int main(){
     int arr[] = {10,5,70,1,40,2,12};
     int size = sizeof(arr)/sizeof(arr[0]);
     int max = arr[0];
     int min = arr[0];

     for(int i = 1; i<size; i++){
          if(arr[i]>max)
               max = arr[i];
          if(arr[i]<min)
               min = arr[i];
     }

     printf("Max = %d\n",max);
     printf("Min = %d\n",min);
}
