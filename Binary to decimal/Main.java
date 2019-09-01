#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int n,i,rev=0,rem,base=1;
  scanf("%ld",&n);
  while(n>0)
  {
    rem=n%10;
    rev=rev+rem*base;
    n=n/10;
    base=base*2;
  }
  printf("%ld",rev);
}
  
  