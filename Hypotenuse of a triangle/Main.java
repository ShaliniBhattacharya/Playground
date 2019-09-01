#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float perp,base,hyp;
  scanf("%f%f",&base,&perp);
  hyp=sqrt((perp*perp)+(base*base));
  printf("%.2f",hyp);
  return 0;
}