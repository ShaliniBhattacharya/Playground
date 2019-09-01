#include <stdio.h>
#include <math.h>
int main()
{
  	//Your code here  
  long int b,p,ans;
  scanf("%ld%ld",&b,&p);
  if(p<0)
    printf("Wrong input");
  else
  {
  ans=pow(b,p);
  printf("%ld",ans);
  }
    return 0;
}