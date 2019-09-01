#include <stdio.h>
int main() {
	//Type your code
  int rem,s=0,t,n;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
    rem=t%10;
    s=s+(rem*rem*rem);
    t/=10;
  }
  if(s==n)
    printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
	return 0;
}