#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  int i,len,count=1;
  char s[100];
  scanf("%s",s);
  len=strlen(s);
  if(len>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0;i<len;i++)
    {
      if(s[i]==s[i+1])
      {
      count++;
      }
      else
      {
        printf("%c%d",s[i],count);
        count=1;
      }
    }
  }
}