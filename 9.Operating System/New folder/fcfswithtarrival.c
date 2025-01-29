#include<stdio.h>
# define max 30
int main(){
  int i, j, n, bt[max], at[max], wt[max], tat[max], ct[max], temp[max];
  float awt=0, atat=0;

  printf("Enter the number of process: ");
  scanf("%d", &n);

  printf("Enter the burst time of the process: ");
  for(i=0; i<n; i++){
    scanf("%d", &bt[i]);
  }
  printf("Enter the arrival time of the process: ");
  for(i=0; i<n; i++){
    scanf("%d", &at[i]);
  }

  printf("process\t burst time\t arrival time\t waiting time\t turn around time\t completion time\n");
  for(i=0; i<n; i++){
    wt[i]=0;
    tat[i]=0;
    temp[i+1]=temp[i]+bt[i];
    wt[i] = temp[i]-at[i];
    tat[i] = wt[i]+bt[i];
    ct[i]=tat[i]+at[i];
    awt=awt+wt[i];
    atat=atat+tat[i];
    printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i+1, bt[i], at[i], wt[i], tat[i], ct[i]);
  }
  awt=awt/n;
  atat=atat/n;
  printf("Average waiting time: %.2f\n", awt);
  printf("Average Turn Around time: %.2f\n", atat);
  return 0;
}
