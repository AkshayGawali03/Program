#include<stdio.h>
int main()
{

    int i = 1;
    int count = 0;

    printf("Enter number of times you want to display jay ganesh on screen\n");
    scanf("%d",&count);
     do
    {

        printf("jay gaensh...\n");
        i++;
    }while(i <= count);

    return 0;

}