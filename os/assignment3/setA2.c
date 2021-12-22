#include<stdio.h>
#include<string.h>
struct input
{
    char pname[10];
    int at,bt,ct,tbt;
}tab[5];


struct sequence
{
    int start,end;
    char pname[10];
}seq[100],seq2[20];


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
        scanf("%s",tab[i].pname);
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
        printf("\n%s\t%d\t%d",tab[i].pname,tab[i].tbt,tab[i].at);
    }
}

void bubble()
{
    struct input t;
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<(n-1)-i;j++)
        {
            if(tab[j].at>tab[j+1].at)
            {
                t=tab[j];
                tab[j]=tab[j+1];
                tab[j+1]=t;
            }
  
        }
    
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
        printf("\n\n%s\t%d\t%d\t%d\t%d\t%d",tab[i].pname,
                                            tab[i].at,
                                            tab[i].bt,
                                            tab[i].ct,
                                            tab[i].ct-tab[i].at,
                                            tab[i].ct-tab[i].at-tab[i].bt);
        atat+=tab[i].ct-tab[i].at;
        awt+=tab[i].ct-tab[i].at-tab[i].bt;
    }
    atat/=n;
    awt /=n;
    printf("\n\n\n avarage tat=%f",atat);
    printf("\n\n avarge wt=%f",awt);

}

int arrived(int t)
{
    int i;
    for ( i = 0; i < n; i++)
    {
        /* code */
        if (tab[i].at<=t && tab[i].tbt!=0)
        {
            /* code */
            return 1;
        }
    }
    return 0;
}

int getmin(int t)
{
    int i,mini,min=99;
    for ( i = 0; i < n; i++)
    {
        /* code */
        if (tab[i].at<=t && tab[i].tbt!=0 && tab[i].tbt<min)
        {
            /* code */
            min=tab[i].tbt;
            mini=i;
        }
    }
    return mini;
}



void processinput()
{
    int i,j;
    finish=k=0;
    while (finish!=n)
    {
       if (arrived(time))
       {
           /* code */
           i=getmin(time);
           for(j=0;j<tab[i].bt;j++)
           {
                time++;
                tab[i].tbt--;
                tab[i].ct=time;
                printinput();
                seq[k].start=prev;
                seq[k].end=time;
                strcpy(seq[k++].pname,tab[i].pname);
                prev=time;
           }
       }
        /* code */
    }
}
