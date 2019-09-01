#include<stdio.h>
int main()
{
  // fill your code
  int i,n,j;
  scanf("%d",&n);
  int ar[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  int temp;
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(ar[i]>ar[j])
      {
        temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
      }
    }
  }
  printf("Sorted array is:\n");
  for(i=0;i<n;i++)
  {
    printf("%d\n",ar[i]);
  }
  return 0;
}