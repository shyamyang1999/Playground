#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  printf("second greatest = ");
  if(a>b && a>c)
  {if(b>c)
    printf("%d",b);
   else
     printf("%d",c);}
  else if(b>a && b>c)
  {if(a>c)
    printf("%d",a);
   else
     printf("%d",c);}
  else if(c>b && c>a)
  {if(b>a)
    printf("%d",b);
   else
     printf("%d",a);}
   return 0;}