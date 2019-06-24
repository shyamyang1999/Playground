#include <stdio.h>
int main() {
	int n,count;
    scanf("%d",&n);
    for (int count=1;count<=n;count=count+1)
    {if (count%2 !=0)
      printf("%d\n",count);}
	return 0;
}