#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
 float det,a,b,c,real,img;
  scanf("%f%f%f",&a,&b,&c);
  det=((b*b)-(4*a*c));
  float d1,d2;
  if(det>0)
  {
     d1=(-b+sqrt(det))/(2*a);
  d2=(-b-sqrt(det))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",d1,d2);
  }
  else if(det==0)
  {
    d1=d2=(-b/2*a);
    printf("root1 = %.2f  root2 = %.2f",d1,d2);
  }
  else
  {
    real=(-b/(2*a));
    img=(sqrt(-det)/(2*a));
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
  return 0;
}