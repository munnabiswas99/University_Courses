#include<stdio.h>
int main(){
     int n,search,count = 0;
     printf("Enter many Numbers you want to insert?\n");
     scanf("%d",&n);
     int arr[n];

     printf("Enter %d array elements:\n",n);
     for(int i = 0; i<n; i++){
          scanf("%d",&arr[i]);
     }

     printf("Enter Data You want to search: \n");
     scanf("%d",&search);

     for(int i = 0; i<n; i++){
          if(arr[i] == search){
               printf("%d is found at index %d",search,i);
               count++;

          }
     }
     if(count == 0)
          printf("%d not Found in the array\n",search);
}
