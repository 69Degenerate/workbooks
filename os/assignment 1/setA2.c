#include<stdio.h>
int main()
{
    int pid,retnice;
    printf("press DEL to stop \n");
    pid=fork();
    for(;;)
    {
        if(pid==0)
        {
            retnice=nice(-5);
            printf("child get high %d\n",retnice);
            sleep(0);
        }
        else
        {
            retnice=nice(4);
            printf("parent get high %d\n",retnice);
            sleep(0);
        }
    }
}
