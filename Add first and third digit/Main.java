#include<stdio.h>
#include<stdlib.h>
int main()
{
  int first,last,n,s=0;
  scanf("%d",&n);
  last=n%10;
  first=n;
  while(n>=10)
  {
    n=n/10;
  }
  first=n;
  s=first+last;
  printf("%d",s);
  //Type your code here
  return 0;
}