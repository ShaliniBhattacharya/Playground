#include<stdio.h>

int main()
{
  // Type your code here
   int a,b,c,d,min;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  min=(a<b)?(a<c)?(a<d)?a:d:(c<d)?c:d:(b<c)?(b<d)?b:d:(c<d)?c:d;
  printf("%d",min);
}