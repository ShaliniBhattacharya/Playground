#include<stdio.h>
int main()
{
  	//type your code here
  int i,n,max;
  scanf("%d",&n);
  int ar[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  max=ar[0];
  for(i=0;i<n;i++)
  {
    if(max<ar[i])
      max=ar[i];
  }
  printf("%d",max);
}