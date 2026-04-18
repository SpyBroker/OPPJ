#include<stdio.h>
#include<unistd.h>
int main()
{
	int t;
	printf("A : %d %d\n",getpid(),getppid());
	t=fork();
	if(t==0)
	{
		printf("B : %d %d\n",getpid(),getppid());
		printf("C : %d %d\n",getpid(),getppid());
		printf("D : %d %d\n",getpid(),getppid());
	}
}
