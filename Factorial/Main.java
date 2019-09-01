#include<stdio.h>
int main()
{
	//your code here
  long int i,n,fact=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact*=i;
  }
  printf("%ld",fact);
}