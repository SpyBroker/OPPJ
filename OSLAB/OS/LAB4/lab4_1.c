#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main()
{
        int t , u , v;
        printf("P1 : %d %d\n",getpid(),getppid());	
        
	t=fork();
        if(t==0)
        {
                printf("P2 : %d %d\n",getpid(),getppid());
		
		u=fork();
		if(u==0)
			printf("P3 : %d %d\n",getpid(),getppid());

		else
		{
			v=fork();
			if(v==0)
				printf("P4 : %d %d\n",getpid(),getppid());
			
		}
		
	}
	else
		wait(NULL);
	return 0;
}
