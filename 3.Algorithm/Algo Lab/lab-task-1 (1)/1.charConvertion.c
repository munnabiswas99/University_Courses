#include<stdio.h>
int main(){
     int n;
     printf("Enter the size of string: ");
     scanf("%d", &n);
     char str[n];
     printf("Enter the string: \n");
     scanf("%s",&str);
     for(int i = 0; i<n; i++){
          int ascii = str[i];
          printf("%c",ascii+1);
     }
}
