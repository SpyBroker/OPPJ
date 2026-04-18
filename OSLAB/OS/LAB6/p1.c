#include <stdio.h>

struct Process
{
    int at, bt, tat, rt, wt, rem;
};

int main()
{
    struct Process P[3], temp;
    int i, j, ct = 0, tq, completed = 0;

    printf("Enter Time Quantum: ");
    scanf("%d", &tq);

    for(i = 0; i < 3; i++)
    {
        printf("Enter AT and BT for P%d: ", i+1);
        scanf("%d %d", &P[i].at, &P[i].bt);
        P[i].rem = P[i].bt;
        P[i].rt = -1;
        P[i].wt = P[i].tat = 0;
    }

    for(i = 0; i < 3; i++)
    {
        for(j = i + 1; j < 3; j++)
        {
            if(P[i].at > P[j].at)
            {
                temp = P[i];
                P[i] = P[j];
                P[j] = temp;
            }
        }
    }

    printf("Processes after sorting:\n");
    for(i = 0; i < 3; i++){
    	printf("Process P%d:\t",i+1);
        printf("AT:%d  BT:%d\n", P[i].at, P[i].bt);
    }

    while(completed < 3)
    {
        int executed = 0;

        for(i = 0; i < 3; i++)
        {
            if(P[i].at <= ct && P[i].rem > 0)
            {
                executed = 1;

                if(P[i].rt == -1)
                    P[i].rt = ct - P[i].at;

                if(P[i].rem > tq)
                {
                    ct += tq;
                    P[i].rem -= tq;
                }
                else
                {
                    ct += P[i].rem;
                    P[i].rem = 0;
                    P[i].tat = ct - P[i].at;
                    P[i].wt = P[i].tat - P[i].bt;
                    completed++;
                }
            }
        }

        if(!executed)
            ct++;
    }

    printf("\nRound Robin Result:\n");
    for(i = 0; i < 3; i++)
        printf("Process P%d:\t AT:%d BT:%d WT:%d RT:%d TAT:%d\n", i+1, P[i].at, P[i].bt, P[i].wt, P[i].rt, P[i].tat);

    return 0;
}

