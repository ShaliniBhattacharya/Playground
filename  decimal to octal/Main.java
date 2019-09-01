#include<stdio.h>
int main()
{
  //type your code here
  int i,n;
  scanf("%d",&n);
  int ar[n];
  for(i=0;n>0;i++)
  {
    ar[i]=n%8;
    n/=8;
  }
  for(i=i-1;i>=0;i--)
    printf("%d",ar[i]);
  return 0;
}