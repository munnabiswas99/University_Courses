#include<stdio.h>
int main()
{
    int num1,num2,sum;
    printf("Enter two numbers \n");
    scanf("%d%d",&num1,&num2);
    sum=num1+num2;
    if (sum>5)
        printf("Well done");
    else
        printf("Try again leter");
    return 0;
}
