#include<stdio.h>
int main()
{
  int a,num_first,num_second,sum;
  scanf("%d",&a);
  num_first=a%10;
  num_second=a/100;
  sum=num_first+num_second;
  printf("%d",sum);
  return 0;
}