#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char s[100];
  scanf("%[^\n]s",s);
  int len,i,sum=0,count=1;
  len=strlen(s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' '){
      count++;
      //sum+=count;
    }
  }
  printf("%d",count);
}