#include<stdio.h>
#include<pthread.h>
#include<unistd.h>
int x=5;
void *func1(){
	printf("th1: before updation:%d\n",x);
	x++;
	printf("th:1 after updation:%d\n",x);
	sleep(5);
}
void *func2(){
	printf("th2: before updation:%d\n",x);
	x--;
	printf("th2: after updation:%d\n",x);
	sleep(5);
}
int main(){
	pthread_t th1, th2;

	pthread_create(&th1, NULL, func1, &x);
	pthread_create(&th2, NULL, func2, &x);

	pthread_join(th1, NULL);
	pthread_join(th2, NULL);

	printf("final value of x: %d\n", x);
	return 0;
}
