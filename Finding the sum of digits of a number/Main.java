#include <stdio.h>

int main()
{
    int num, sum=0;
  scanf("%d", &num);
  while(num!=0)
    {
        sum += num % 10;

        /* Remove last digit from num */
        num = num / 10;
    }

    printf("%d", sum);

    return 0;
}