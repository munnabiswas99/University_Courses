#include<stdio.h>
int main(){
     int arr[] = {10,20,30,40,50,60};
     int size = sizeof(arr)/sizeof(arr[0]);
     int item = 10;

     int result = binarySearch(arr, item, 0, size-1);
     if(result == -1)
          printf("Not Found");
     else
          printf("Fount at index %d",result);
}

int binarySearch(int arr[], int item, int low, int high){


     while(low<=high){
          int mid = (low+high)/2;
          if(arr[mid] == item)
               return mid;
          else if(arr[mid]<item)
               low = mid+1;
          else
               high = mid-1;
     }
     return -1;
}
