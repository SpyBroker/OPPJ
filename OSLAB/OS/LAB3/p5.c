#include<stdio.h>
#include<unistd.h>
int main()
{
        int t;
        printf("A\n");
        t=fork();
        if(t==0)
                printf("B\n");
	else
		printf("C\n");
}
