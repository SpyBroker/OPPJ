#include<stdio.h>
#include<unistd.h>
int main()
{
	printf("A\n%d  %d",getpid(),getppid());
	fork();
	printf("B\n%d  %d",getpid(),getppid());
	fork();
	printf("C\n%d  %d",getpid(),getppid());
}
