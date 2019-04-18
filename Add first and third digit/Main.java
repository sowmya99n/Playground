#include<stdio.h>
int main()
{
 int num,add,temp,num1,num2;
    scanf("%d",&num);
    temp=num;
    num1=temp/100;
    num2=temp%10;
    add=num1+num2;
    printf("%d",add);//Type your code here
  return 0;
}