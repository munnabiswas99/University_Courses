#include<stdio.h>
int main()
{
    int num;
    printf("Enter a number: ");
    scanf("%d",&num);
    if(num%4==0 && num%6==0)
    {
        printf("%d is divisible by 4 and 6",num);
    }
    else
    {
        printf("%d is not divisible by 4 and 6",num);
    }
    return 0;
}
