#include<stdio.h>
int main()
{
  	//type your code here
  int i,n,n1,n2,pos1=-1,pos2=-1;
  scanf("%d",&n);
  int ar[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  scanf("%d%d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    if(ar[i]==n1 && pos1==-1)
    {
   pos1=i;
    }
    if(ar[i]==n2 && pos2==-1)
    {
   pos2=i;
    }
  }
 
  printf("Element 1 index = %d\n",pos1);
    printf("Element 2 index = %d\n",pos2);
  
}