#include <stdio.h>
int main() {
	int n,s=0;
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
    
  }
  s=n%10;
  printf("%d",s);
  //Type your code
	return 0;
}