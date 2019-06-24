#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int f=1;
    for(int i=1;i<=n;i=i+1)
    {f=f*i;}
    printf("%d",f);
    return 0;
    
}