#include<stdio.h>
#include<unistd.h>

struct Process
{
	int at, bt, tat, rt, wt;
};
int main()
{
	struct Process P[3];
	struct Process temp;
	int ct=0;
	for(int i=0; i<3; i++)
	{
		printf("Enter AT, BT for process P%d:",i+1);
		scanf("%d %d",&P[i].at, &P[i].bt);
		P[i].tat=0;
		P[i].rt=0;
		P[i].wt=0;
	}

	for(int i=0; i<3; i++)
	{
		for(int j=i+1; j<3; j++)
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

	for(int i=0; i<3; i++)
	{
		if(ct < P[i].at)
			ct = P[i].at;
		P[i].rt = ct - P[i].at;
		P[i].wt = P[i].rt;
		ct = ct+P[i].bt;
		P[i].tat = ct - P[i].at;
	}

	for(int i=0; i<3; i++)
	{
		printf("Process P%d",i+1);
		printf("\nAT:%d  BT:%d  TAT:%d  RT:%d  WT:%d\n", P[i].at, P[i].bt, P[i].tat, P[i].rt, P[i].wt);
	}

	return 0;
}
