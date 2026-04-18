#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main()
{
        int t, u;
        printf("A : %d %d\n",getpid(),getppid());
        t=fork();
        if(t==0)
	{
                printf("B : %d %d\n",getpid(),getppid());
		u=fork();
		if(u==0)
               		printf("C : %d %d\n",getpid(),getppid());
	}
	wait(NULL);
	return 0;
}
