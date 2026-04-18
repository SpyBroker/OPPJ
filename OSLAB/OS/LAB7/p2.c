#include<stdio.h>
#include<pthread.h>
#define n 10
int arr[n] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
int m;

void *f1(void *arg){
	printf("First half of array:\t");
	for(int i=0; i<m; i++)
		printf("%d  ",arr[i]);
	printf("\n");
	
}
void *f2(void *arg){
	printf("Second half of array:\t");
	for(int i=m; i<n; i++)
		printf("%d  ",arr[i]);
	printf("\n");
}
int main(){
	pthread_t th1, th2;

	if(n%2==0)
        	m=n/2;
	else
        	m=(n+1)/2;
	pthread_create(&th1, NULL, f1, &arr);
	pthread_create(&th2, NULL, f2, &arr);

	pthread_join(th1, NULL);
        pthread_join(th2, NULL);

	return 0;
}

