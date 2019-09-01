#include<stdio.h>
int main()
{
	//type your code here
  int n;
  scanf("%d",&n);
  if(n%2==0)
    printf("%d",(n-1)/2);
  else 
    printf("%d",(n-1));
	return 0;
}