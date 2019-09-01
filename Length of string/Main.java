#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int len,i=0,count=0;
  char s[100];
  scanf("%[^\n]s",s);
 while(s[i]!=NULL)
 {
  len++;
   i++;
 }
  printf("%d",len);
  return 0;
}
