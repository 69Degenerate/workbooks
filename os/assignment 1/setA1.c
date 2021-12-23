#include <stdio.h>
#include <sys/types.h>
void child();
void parent();
int main()
{
    pid_t pid;
    pid = fork();
    if (pid == 0)
        child();
    else
        parent();
    return 0;
}
void child()
{
    printf("child i am,");
}
void parent()
{
    printf("im dissapoint...........");
}
