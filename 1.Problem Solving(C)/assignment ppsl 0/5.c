//Add 6 number in 4 step
#include<stdio.h>
int main()
{
    int n1=2,n2=3,n3=4,n4=5,n5=6,n6=7,sum1,sum2,sum3,sumT;
    sum1=n1+n2;
    sum2=n3+n4;
    sum3=n5+n6;
    sumT=sum1+sum2+sum3;

    printf(" %d+%d=%d \n %d+%d=%d \n %d+%d=%d \n %d+%d+%d=%d",n1,n2,sum1,n3,n4,sum2,n5,n6,sum3,sum1,sum2,sum3,sumT);

    getchar();
}
