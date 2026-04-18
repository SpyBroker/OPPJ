#include<stdio.h>
#include<unistd.h>
int b=3;
int main()
{
        int a=2;
	a++;
	fork();
	printf("%d %d\n",b,a);
	printf("%d\n",&a);
}
