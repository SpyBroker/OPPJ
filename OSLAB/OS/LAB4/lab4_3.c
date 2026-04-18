#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main()
{
    int t0, t1, t2, t3, t4, t5, t6, t7;

    printf("P1  : %d %d\n", getpid(), getppid());

    t0 = fork();
    if (t0 == 0)
    {
        printf("P2  : %d %d\n", getpid(), getppid());

        t1 = fork();
        if (t1 == 0)
        {
            printf("P3  : %d %d\n", getpid(), getppid());

            t3 = fork();
            if (t3 == 0)
            {
                printf("P5  : %d %d\n", getpid(), getppid());

                t5 = fork();
                if (t5 == 0)
                {
                    printf("P7  : %d %d\n", getpid(), getppid());
                }
                else
                {
                    wait(NULL);

                    t6 = fork();
                    if (t6 == 0)
                        printf("P8  : %d %d\n", getpid(), getppid());

                    wait(NULL);
                }
            }
            wait(NULL);
        }
        else
        {
            wait(NULL);

            t2 = fork();
            if (t2 == 0)
            {
                printf("P4  : %d %d\n", getpid(), getppid());

                t4 = fork();
                if (t4 == 0)
                {
                    printf("P6  : %d %d\n", getpid(), getppid());

                    t7 = fork();
                    if (t7 == 0)
                        printf("P9  : %d %d\n", getpid(), getppid());

                    wait(NULL);
                }
                wait(NULL);
            }
            wait(NULL);
        }
    }
    else
        wait(NULL);

    return 0;
}

