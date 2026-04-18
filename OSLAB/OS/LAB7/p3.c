#include <stdio.h>
#include <pthread.h>
#define n 10

int arr[n] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
int sum1 = 0, sum2 = 0;
int m=n/2;

void *add1(void *arg)
{
    for(int i = 0; i < m; i++)
        sum1 += arr[i];
}
void *add2(void *arg)
{
    for(int i = n-1; i >= m; i--)
        sum2 += arr[i];
}
int main()
{
    pthread_t th1, th2;

    pthread_create(&th1, NULL, add1, NULL);
    pthread_create(&th2, NULL, add2, NULL);

    pthread_join(th1, NULL);
    pthread_join(th2, NULL);

    int total = sum1 + sum2;

    printf("Sum of first half = %d\n", sum1);
    printf("Sum of second half = %d\n", sum2);
    printf("Total sum = %d\n", total);

    return 0;
}
