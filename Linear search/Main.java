#include<stdio.h>
int main()
{
  //Type your code here
  int i,n,search,flag;
  scanf("%d",&n);
  int ar[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  scanf("%d",&search);
  for(i=0;i<n;i++)
  {
    if(ar[i]==search)
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
    printf("%d",i+1);
  else
    printf("%d isn't present in the array.",search);
  return 0;
}