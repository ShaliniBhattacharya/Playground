#include<stdio.h>
#include<math.h>
int three(n)
{
  int x,i;
  for(i=0;i<100;i++)
  {
      x=pow(3,i);
    if(i==n)
      printf("%d",x);
  }
}
int two(n)
{
  int x,i;
  for(i=0;i<100;i++)
  {
    x=pow(2,i);
    if(i==n)
      printf("%d",x);
  }
}
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  if(n%2==0)
    three(n/2-1);
  else
    two(((n+1)/2)-1);
  return 0;
}