#include <stdio.h>
int main() {
  int first,last,s=0,n,temp1,temp2;
  scanf("%d",&n);
  first=n;
  last=n%10;
  while(n>=10)
  {
    n/=10;
  }
  first=n;
  s=first+last;
  printf("%d",s);
	//Type your code
	return 0;
}