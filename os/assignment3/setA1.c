#include<stdio.h>
#include<string.h>
struct input
{
    char name[10];
    int at,bt,ct,tbt;
}tab[10];

struct sequence
{
    int start,end;
    char name[10];
    /* data */
}seq[10],seq2[20];


int finish,time,n,k,prev;
void getinput()
{
    int i;
    System("clear");
    printf("\n enter number of process:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\n enter number of process: ");
        scanf("%s",tab[i].name);
        printf("\n burst time:");
        scanf("%d",&tab[i].bt);
        printf("\n arrivel time:");
        scanf("%d",&tab[i].at);
        tab[i].tbt=tab[i].bt;
    }
}
void printinput()
{
    int i;
    printf("\n\n process \t bt \tat");
    
    for(i=0;i<n;i++)
    {
        printf("\n%s\t%d\t%d",tab[i].name,tab[i].tbt,tab[i].at);
    }
}

void bubble()
{
    struct input t;
    int i,j;
    for(i=0;i<n;i++)
    for(j=0;j<(n-1)-i;j++)
    if(tab[j].at>tab[j+1].at)
    {
        t=tab[j];
        tab[j]=tab[j+1];
        tab[j+1]=t;
    }
}


void printoutput()
{
    int i;
    float atat=0,awt=0;
    printf("\n ###########  FINAL TABLE   #################");
    printf("\n \n process \t at \t bt \t ct \t tat \t wt");
    for(i=0;i<n;i++)
    {
        printf("%s%d%d%d%d%d",tab[i].name,tab[i].at,tab[i].bt,tab[i].ct,tab[i].ct-tab[i].ct-tab[i].at-tab[i].bt);
        atat+=tab[i].ct-tab[i].at;
        awt+=tab[i].ct-tab[i].at-tab[i].bt;
    }
    atat/=n;
    awt /=n;
    printf("\n\n\n avarage tat=%f",atat);
    print("\n\n avarge wt=%f",awt);

}


void processinput()
{
    int i,j;
    finish=k=0;
    for(i=0;i<n;i++)
    {
        for(j=0;j<tab[i].bt;j++)
        {
            time++;
            tab[i].tbt--;
            tab[i].ct=time;
            printinput();
            seq[k].start=prev;
            seq[k].end=time;
            strcpy(seq[k++].name,tab[i].name);
            prev=time;
        }
    }
}


void ganttchart()
{
    int i=0;
    printf("\n\n #############  GANTT CHART  #############");
    for(i=0;i<k;i++)
    printf("| %d--%d--%d",seq[i].start,seq[i].name,seq[i].end);

}

int main()
{
    int i ;
    getinput();
    printf("\n\n enter data");
    printinput();
    bubble();
    printf("data after sorting according to arival time:");
    printinput();
    processinput();
    printoutput();
    ganttchart();
    return 0;
}





