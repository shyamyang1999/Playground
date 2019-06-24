#include <stdio.h>
int main() {
    int n,num;
	scanf("%d",&n);
    if (n<100)
    {num=n%10;
     printf("%d",num);}
    else
      while(n>0)
      {n=n/10;
        if(n<100&& n>10)
         {num=n%10;
          printf("%d",num);}}
      
	return 0;
}