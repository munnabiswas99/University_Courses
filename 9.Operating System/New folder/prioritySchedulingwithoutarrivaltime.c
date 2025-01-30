#include<stdio.h>
# define max 30
int main(){
  int i, j, n, t, bt[max], wt[max], pr[max], tat[max], pos;
  float awt=0, atat=0;

  printf("Enter the number of process: ");
  scanf("%d", &n);

  printf("Enter the burst time of the process: ");
  for(i=0; i<n; i++){
    scanf("%d", &bt[i]);
  }

  printf("Enter the priority of the process: ");
  for(i=0; i<n; i++){
    scanf("%d", &pr[i]);
  }


for(i=0; i<n; i++){
        pos=i;
        for(j=i+1; j<n; j++){
            if(pr[j] < pr[pos]){
               pos=j;
            }
        }
        t=pr[i];
        pr[i]=pr[pos];
        pr[pos]=t;

        t=bt[i];
        bt[i]=bt[pos];
        bt[pos]=t;
}

  printf("process\t burst time\t priority\t waiting time\t turn around time\n");
  for(i=0; i<n; i++){
    wt[i]=0;
    tat[i]=0;
    for(j=0; j<i;j++){
        wt[i] = wt[i]+bt[j];
    }
    tat[i] = wt[i]+bt[i];
    awt=awt+wt[i];
    atat=atat+tat[i];
    printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i+1, bt[i], pr[i], wt[i], tat[i]);
  }
  awt=awt/n;
  atat=atat/n;
  printf("Average waiting time: %.2f\n", awt);
  printf("Average Turn Around time: %.2f\n", atat);
  return 0;
}
