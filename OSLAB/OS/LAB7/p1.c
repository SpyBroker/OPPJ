#include<stdio.h>
#include<pthread.h>
int a = 1;
void *mythread(){
	for(int i=0; i<100000; i++){
		a++;
	}
}

int main(){
	pthread_t th1, th2;
	pthread_create(&th1, NULL, mythread, &a);
	pthread_create(&th2, NULL, mythread, &a);

	pthread_join(th1, NULL);
	pthread_join(th2, NULL);
	
	printf("value of a: %d\n",a);
	return 0;
}
