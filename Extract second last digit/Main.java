#include<stdio.h>
int main()
{
  int temp1,temp2,n;
  scanf("%d",&n);
  temp1=n%10;
  n=n/10;
  temp2=n%10;
  printf("%d",temp2);
  //Type your code here
  return 0;
}