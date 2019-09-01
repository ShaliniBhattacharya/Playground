#include <stdio.h>
int main() {
  int rem,n,dig=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    dig=dig+rem;
    n=n/10;
  }
  printf("%d",dig);
	//Type your code
	return 0;
}