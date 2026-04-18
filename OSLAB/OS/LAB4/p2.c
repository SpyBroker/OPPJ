#include<stdio.h>
#include<unistd.h>
int main()
{
        int t;
	printf("A %d %d\n",getpid(),getppid());
	t=fork();
	if(t==0)
	{
		fork();
		printf("%d %d",getpid(),getppid());
	}
}
