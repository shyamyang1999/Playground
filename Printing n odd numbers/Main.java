#include <stdio.h>
int main() {
    int n,count,num;
    scanf("%d",&n);
    for (int count=1;count<=n;num=num+1)
      if(num%2!=0)
      {printf("%d\n",num);
       count=count+1;}
	return 0;
}