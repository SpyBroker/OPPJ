#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

int arr[10] = {25, 5, 40, 15, 50, 10, 35, 20, 45, 30};
int n=10;

void merge(int l, int m, int h){
	int temp[20];
	int i=l, j=m+1, k=l;

	while(i<=m && j<=h){
		if(arr[i] <= arr[j])
			temp[k++] = arr[i++];
		else
			temp[k++] = arr[j++];
	}
	while(i<=m)
                temp[k++] = arr[i++];
        while(j<=h)
                temp[k++] = arr[j++];
	for(i=l; i<=h; i++)
		arr[i] = temp[i];
}
void mergesort(int l, int h){
	if (l<h){
		int m = (l+h)/2;
		mergesort(l,m);
		mergesort(m+1,h);
		merge(l,m,h);
	}
}

void *s1(void *arg){
	printf("Thread 1 running....\n");
	mergesort(0, n/2 -1);
	pthread_exit(0);
}
void *s2(void *arg){
	printf("Thread 2 running....\n");
	mergesort(n/2, n-1);
	pthread_exit(0);
}
int main(){

	printf("Before sorting:\n");
	for(int i=0; i<n; i++)
		printf("%d\t", arr[i]);
	printf("\n");
	pthread_t th1, th2;

        pthread_create(&th1, NULL, s1, NULL);
	pthread_create(&th2, NULL, s2, NULL);

        pthread_join(th1, NULL);
        pthread_join(th2, NULL);

	merge(0, n/2 -1, n-1);

        printf("After sorting:\n");
        for(int i=0; i<n; i++)
		printf("%d\t", arr[i]);
        printf("\n");

    return 0;
}
