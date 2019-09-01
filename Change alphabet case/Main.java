#include <stdio.h>
int main() {
	// Type your code here
  char c;
  int s;
  scanf("%c",&c);
  if(c>='a' && c<='z')
    s=c-32;
  else if(c>='A' && c<='Z')
    s=c+32;
  printf("%c",(char)s);
	return 0;
}