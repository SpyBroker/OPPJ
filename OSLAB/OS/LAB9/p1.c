#include <stdio.h>
#include <unistd.h>
#include <pthread.h>
#define n 10

int arr[n] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
int sum1 = 0, sum2 = 0;
int m=n/2;

void *add1(void *arg){
	printf("Thread 1 running....\n");
	for(int i=0; i<m; i++)
		sum1 += arr[i];
}
void *add2(void *arg){
	printf("Thread 2 running....\n");
	for(int i=n-1; i>=m; i--)
                sum2 += arr[i];
}

int main(){
	pthread_t th1, th2;
	
	pthread_create(&th1, NULL, add1, NULL);
	pthread_create(&th2, NULL, add2, NULL);

	pthread_join(th1, NULL);
	pthread_join(th2, NULL);

	printf("Sum of 1st half: %d\n", sum1);
	printf("Sum of 2nd half: %d\n", sum2);
	printf("Total sum: %d\n", sum1+sum2);
	return 0;
}
