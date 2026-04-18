#include<stdio.h>
#include<pthread.h>
#include<unistd.h>
#include<semaphore.h>

void *func1();
void *func2();

sem_t s;
int x=5;
int main(){
	sem_init(&s, 0, 1);

	pthread_t th1, th2;
	pthread_create(&th1, NULL, func1, NULL);
	pthread_create(&th2, NULL, func2, NULL);
	pthread_join(th1, NULL);
	pthread_join(th2, NULL);
	printf("Final value of x:%d\n", x);

}
void *func1(void *args){
	sem_wait(&s);
	printf("th1 reads value of x:%d\n", x);
	sleep(5);
	x++;
	printf("Updating:%d\n", x);
	sleep(5);
	printf("Updated value of x by th1:%d\n", x);
	sem_post(&s);
}
void *func2(void *args){
	sem_wait(&s);
	printf("th2 reads value of x:%d\n", x);
	sleep(5);
	x--;
	printf("Updating:%d\n", x);
	sleep(5);
	printf("Updated value of x by th2:%d\n", x);
	sem_post(&s);
}
