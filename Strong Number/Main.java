#include<stdio.h>
int main()
{
    int n,x,sum=0,num;
    scanf("%d",&n);
    x=n;
    while(n>0)
    {num=n%10;
    int f=1;
    for(int i=1;i<=num;i=i+1)
    {f=f*i;}
    sum=sum+f;
    n=n/10;}
    if (sum==x)
    {printf("Yes");}
    else
    {printf("No");}
    return 0;
}