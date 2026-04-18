#include<stdio.h>
#include<pthread.h>

void *mythread_function(void *args)
{
	int *a=(int *)args;
	printf("I am a thread %d\n", *a);
}

int main()
{
	int a=10, b=20;
	printf("Process started\n");
	pthread_t th1, th2;

	pthread_create(&th1, NULL, mythread_function, &a);
	pthread_create(&th2, NULL, mythread_function, &b);

	pthread_join(th1, NULL);
	pthread_join(th1, NULL);

	printf("Process finished\n");

	return 0;
}
