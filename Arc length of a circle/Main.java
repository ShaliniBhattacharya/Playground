#include<stdio.h>
int main()
{
  float r,cent;
  scanf("%f %f",&r,&cent);
  float len;
  len=2*3.14*r*(cent/360);
  printf("%.2f",len);
  return 0;
}