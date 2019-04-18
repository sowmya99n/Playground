#include<stdio.h>
int main()
{
  int n1,n2,n3,total,avg;
  scanf("%d \n %d \n %d",&n1,&n2,&n3);
  total=n1+n2+n3;
  avg=total/3;
  printf("%d",avg);
  return 0;
}