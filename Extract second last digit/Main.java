#include<stdio.h>
int main()
{
  int number,result,value;
  scanf("%d",&number);
  result=number%100;
  value=result/10;
  printf("%d",value);
  return 0;
}