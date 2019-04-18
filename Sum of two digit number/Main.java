#include<stdio.h>
int main()
{
  int n1,res,res1,add;
  scanf("%d",&n1);
  res=n1%10;
  res1=n1/10;
  add=res+res1;
  printf("%d",add);
  return 0;
}