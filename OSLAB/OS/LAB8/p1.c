#include<stdio.h>
#include<pthread.h>
#include<unistd.h>
#include<semaphore.h>

sem_t mutex, wrt;
int x=5;
int rc=0;
void *reader(void *args){
	sem_wait(&mutex);
	rc++;
	if(rc==1)
		sem_wait(&wrt);
	sem_post(&mutex);
	printf("Value of x being read by thread: %ld\n", pthread_self());
	printf("Value of x:%d\n", x);
	sleep(5);
	sem_wait(&mutex);
	rc--;
	if(rc==0)
		sem_post(&wrt);
	sem_post(&mutex);
}
void *writer(void *args){
	sem_wait(&wrt);
	x=x+10;
	printf("Value of x increamented by writer thread: %ld\n", pthread_self());
	sem_post(&wrt);
}
int main(){
	sem_init(&mutex, 0, 1);
	sem_init(&wrt, 0, 1);

	pthread_t th1, th2, th3;
	pthread_create(&th1, NULL, reader, NULL);
	pthread_create(&th2, NULL, reader, NULL);
	pthread_create(&th3, NULL, writer, NULL);

	pthread_join(th1, NULL);
	pthread_join(th2, NULL);
	pthread_join(th3, NULL);

	printf("Final value of x:%d\n", x);
}
