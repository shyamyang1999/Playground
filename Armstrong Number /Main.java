#include<math.h>
#include<stdio.h>
int main()
{
	int n,t,x;
    scanf("%d",&n);
    t=n;
    x=n;
    int count=0;
    while(n>0)
    {n=n/10;
    count=count+1;}
    int num=0;
    int sum=0;
    while(t>0)
    {num=t%10;
    int a;
    a=pow(num,count);
    sum=sum+a;
    t=t/10;}
    if(sum==x)
    {printf("Armstrong Number");}
    else
      printf("Not an Armstrong Number");
    
    
    return 0;
}