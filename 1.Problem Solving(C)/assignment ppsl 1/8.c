#include<stdio.h>
int main()
{
    int num1,num2,remainder;
    printf("Enter two numbers \n");
    scanf("%d%d",&num1,&num2);
    remainder=num1%num2;
    printf("Remainder= %d",remainder);
    getch();
}
