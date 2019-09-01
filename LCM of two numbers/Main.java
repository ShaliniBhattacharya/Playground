#include<stdio.h>
int main()
{
  //Type your code here
  int n1,n2,minmul;
  scanf("%d%d",&n1,&n2);
  minmul=(n1>n2)?n1:n2;
  while(1)
  {
    if(minmul%n1==0 && minmul%n2==0){
      printf("%d",minmul);
    break;
  }
  ++minmul;
  }
  return 0;
}