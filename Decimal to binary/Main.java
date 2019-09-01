#include<stdio.h>
int main()
{
  //Type your code here
  int i,n;
  scanf("%d",&n);
  int a[n];
  for(i=0;n>0;i++)
  {
    a[i]=n%2;
    n/=2;
  }
  for(i=i-1;i>=0;i--)
    printf("%d",a[i]);
  return 0;
}