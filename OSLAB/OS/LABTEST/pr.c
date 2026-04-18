#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main()
{
	int t, u, v;
	printf("P1:\tprocess:%d \tparent:%d",getpid(),getppid());
	t=fork();
	wait(NULL);
	if(t==0)
	{
		printf("\nP2:\tprocess:%d \tparent:%d",getpid(),getppid());
		u=fork();
		wait(NULL);
		if(u==0)
		{
			printf("\nP3:\tprocess:%d \tparent:%d",getpid(),getppid());
		}
		else
		{
			v=fork();
			wait(NULL);
			if(v==0)
				printf("\nP4:\tprocess:%d \tparent:%d",getpid(),getppid());

		}

	}
	else
		wait(NULL);
	return 0;
}
