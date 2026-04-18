#include<stdio.h>
#include<pthread.h>

int arr[15] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
int n = 15;
int m = 15/2 +1;

void *fun1(void *arg){
	printf("Thread1:\n");
	for(int i=0; i<m; i++){
		if(arr[i]%2 == 0)
			printf("%d\t", arr[i]);
	}
	printf("\n");
}
void *fun2(void *arg){
        printf("Thread2:\n");
        for(int i=m-1; i<n; i++){
                if(arr[i]%3 == 0)
                        printf("%d\t", arr[i]);
        }
	printf("\n");
}
void *fun3(){
	printf("Thread3:\n");
	for(int i=0; i<n; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}
int main(){
	pthread_t th1, th2, th3;

	pthread_create(&th1, NULL, fun1, NULL);
	pthread_create(&th2, NULL, fun2, NULL);
	pthread_create(&th3, NULL, fun3, NULL);

	pthread_join(th1, NULL);
        pthread_join(th2, NULL);
	pthread_join(th3, NULL);

	return 0;
}
