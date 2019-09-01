#include <stdio.h>
int main() {
	//Type your code
  int s=0,n,dig,fact;
  scanf("%d",&n);
  int t=n;
  while(t!=0)
  {
    dig=t%10;
    fact=1;
    for(int i=1;i<=dig;i++)
    {
      fact*=i;
    }
    s=s+fact;
    t/=10;
  }
  if(s==n)
    printf("Yes");
  else
    printf("No");
 
	return 0;
}