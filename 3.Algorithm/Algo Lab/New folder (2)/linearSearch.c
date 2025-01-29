#include<stdio.h>
int main(){
     int arr[] = {10,20,30,40,50};
     int key = 50;
     boolean flag = false;

     for(int i = 0; i<sizeof(arr); i++){
          if(arr[i]==key){
               flag = true;
               return i;
          }
     }
     if(flag==true)
          printf("Found at index %d",i);
     else
          printf("not Found");
}
