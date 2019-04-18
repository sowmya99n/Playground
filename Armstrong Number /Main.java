#include <stdio.h>
int main() {
  int number,result,remainder;
  scanf("%d",&number);
  int originalNumber = number;

    while (originalNumber != 0)
    {
         remainder = originalNumber%10;
         result += remainder*remainder*remainder;
        originalNumber /= 10;
    }

    if( result == number)
        printf("Armstrong Number");
    else
        printf("Not an Armstrong Number");

    return 0;
}