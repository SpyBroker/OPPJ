#include<stdio.h>
#include<unistd.h>
int b=3;
int main()
{
        int i=4;
        int j=getpid();
        fork();
	if(j==getpid())
		i++;
        printf("%d\n",i);
}
