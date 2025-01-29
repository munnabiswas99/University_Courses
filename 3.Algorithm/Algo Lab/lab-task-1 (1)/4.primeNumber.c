#include<stdio.h>
int main(){
     printf("Test Case: ");
     int n;
     scanf("%d",&n);
     int arr[n];

     for(int i = 0; i<n; i++){
          scanf("%d",&arr[i]);
     }

     for(int i = 0; i<n; i++){
          int count = 0;
          for(int j = 2; j<=(arr[i]/2); j++){
               if(arr[i]%j==0){
                    count++;
                    break;
               }
          }
     if(count==0)
          printf("%d is a Prime Number\n",arr[i]);
     else
          printf("%d is not a Prime Number\n",arr[i]);

     }
}
