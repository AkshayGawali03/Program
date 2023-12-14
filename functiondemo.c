#include<stdio.h>
int  Addition(int No1, int No2)
{

    int Ans = 0;
    Ans = No1 - No2;
    return Ans;
}
int main()
{
    int Value1 = 0, Value2 = 0;
    int ret = 0;
    printf("Enter frist numberb : \n");
    scanf("%d",&Value1);
    
    printf("Enter second number : \n");
    scanf("%d",&Value2);
    
    ret = Addition(Value1,Value2);
    printf("addition is : %d\n",ret);
    return 0;
    }