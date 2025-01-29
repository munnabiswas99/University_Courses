#include<stdio.h>
int main()
{
    int num[4],i,sum;
    printf("Enter 4 numbers: \n");
    for(i=0; i<4; i++)
    {
        scanf("%d",&num[i]);
    }
    int max=num[0];
    for(i=1; i<4; i++)
    {
        if(max<num[i])
            max=num[i];
    }
    int min=num[0];
    for(i=1; i<4; i++)
    {
        if(min>num[i])
            min=num[i];
    }
    sum=max+min;
    if(sum>5 && sum<9)
    {
        printf("Ground");
    }
    else if(sum>=9)
    {
        printf("Roof");
    }
    else if(sum<6)
    {
        printf("Too small");
    }
    else
    {
        printf("Invalid number");
    }
    return 0;
}

