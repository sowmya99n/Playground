#include<stdio.h>

int main()
{
   int input, firstNumber, lastNumber;
  scanf("%d", &input);
  lastNumber = input%10;
    
    firstNumber = input;

    while(firstNumber >= 10)
    {
        firstNumber /= 10;  // same as firstNumber = firstNumber/10
    }

    printf("%d",firstNumber+lastNumber);
    
    return 0;
}