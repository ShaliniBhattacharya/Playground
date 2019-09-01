#include<stdio.h>
int main()
{
  int n,rem,dig;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    dig=dig+rem;
    n=n/10;
  }
  printf("%d",dig);
  //Type your code here
  return 0;
}