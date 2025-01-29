#include<stdio.h>
int main()
{
    float n1,n2,n3,n4,sum,result;
    printf("Enter 4 numbers \n");
    scanf("%f%f%f%f",&n1,&n2,&n3,&n4);
    sum=n1+n2+n3+n4;
    result=(sum/2)-1;
    printf("%.2f",result);
    getch();

}
