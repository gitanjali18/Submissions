#include<stdio.h>
int main(void)
{
int a,b,c;
scanf("%d%d",&a,&b);
c=a-b;
if(c%10==9)
c=c-1;
else
c=c+1;
printf("%d",c);
return 0;
}