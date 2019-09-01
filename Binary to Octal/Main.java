#include<stdio.h>

int main()
{
  //Type your code here
  int bin,oct=0,j=1,rem;
  scanf("%d",&bin);
  while(bin!=0)
  {
    rem=bin%10;
    oct=oct+(rem*j);
    j=j*2;
    bin/=10;
  }
  printf("%o",oct);
}