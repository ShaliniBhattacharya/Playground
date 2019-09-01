#include <stdio.h>
int main() {
	//Type your code
  int i,n,fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact*=i;
  }
  printf("%d",fact);
	return 0;
}