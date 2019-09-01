#include<stdio.h>
int main()
{
  //fill your code
  int n1,n2;
  scanf("%d",&n1);
  scanf("%d",&n2);
  if(n1%2==0 && n2%2==0)
    printf("Can store");
  else
    printf("Cannot store");
  return 0;
}