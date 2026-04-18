#include <stdio.h>

struct Process
{
    int at, bt, tat, rt, wt, rem;
};

int main()
{
    struct Process P[3], temp;
    int i, j, ct = 0, completed = 0;

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
    printf("After Sorting:\n");
        for(int i=0; i<3; i++)
        {
                printf("Process P%d:\t",i+1);
                printf("AT:%d  BT:%d\n", P[i].at, P[i].bt);
        }

    while(completed < 3)
    {
        int idx = -1;

        for(i = 0; i < 3; i++)
        {
            if(P[i].at <= ct && P[i].rem > 0)
            {
                if(idx == -1 || P[i].rem < P[idx].rem)
                    idx = i;
            }
        }

        if(idx == -1)
        {
            ct++;
            continue;
        }

        if(P[idx].rt == -1)
            P[idx].rt = ct - P[idx].at;

        P[idx].rem--;
        ct++;

        if(P[idx].rem == 0)
        {
            completed++;
            P[idx].tat = ct - P[idx].at;
            P[idx].wt = P[idx].tat - P[idx].bt;
        }
    }

    printf("\nSRTF Result:\n");
    for(i = 0; i < 3; i++)
        printf("Process P%d:\t AT:%d BT:%d WT:%d RT:%d TAT:%d\n", i+1, P[i].at, P[i].bt, P[i].wt, P[i].rt, P[i].tat);
    return 0;
}

