#include<stdio.h>
#include<unistd.h>
int main()
{
	printf("A%d,%d\n",getppid(), getpid());
	printf("B%d,%d\n",getppid(), getpid());
	fork();
	return 0;
}
