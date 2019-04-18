#include<stdio.h>
main()
{
    int i,j,num,k=1;
    scanf("%d",&num);
    for(i=num;i>=1;i--)
    {
    
        for(j=i;j>=1;j--)
        {
            printf("%d",j);
           
        }
        
    printf("\n");
    }
}