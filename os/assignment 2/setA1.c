#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <dirent.h>
#include <fcntl.h>

void count(char c, char *fn)

{
    int cc = 0, lc = 0, wc = 0, handle;
    char ch;
    if (handle = open(fn, O_RDONLY) == -1)
    {
        printf("file %s not found", fn); /* code */
        return;
    }
    while (read(handle, &ch, 1) != 0)
    {
        if (ch == ' ')
        {
            wc++;
            /* code */
        }
        if (ch == '\n')
        {
            lc++; /* code */
        }
        else
        {
            cc++;
        }
        /* code */
    }
    close(handle);
    switch (c)
    {
    case 'c':
        printf("total number of character:%d", cc); /* code */
        break;
    case 'w':
        printf("total no of words:%d", wc);
        break;
    case 'i':
        printf("total number of lines:%D", lc);
        break;
    }
}

main()
{
    char command[80], t1[20], t2[20], t3[20], t4[20];
    int n;
    system("clear");
    while (1)
    {
        printf("\n MYSHELL$:"); /* code */
        fflush(stdin);
        fgets(command, 80, stdin);
        n = sscanf(command, "%s%s%s%s", t1, t2, t3, t4);
        switch (n)
        {
        case 1 /* constant-expression */:
            if (!fork())
            {
                execlp(t1, t1, NULL);
                perror(t1);
                /* code */
            }
            /* code */
            break;
        case 2:
            if (!fork())
            {
                execlp(t1, t1, t2, NULL);
                perror(t1);
                /* code */
            }
            break;
        case 3:
            if (strcmp(t1, "count") == 0)
            {
                count(t2[0], t3);
                /* code */
            }
            else
            {
                if (!fork())
                {
                    execlp(t1, t1, t2, t3, NULL);
                    perror(t1);
                    /* code */
                }
            }
            break;
        case 4:
            if (!fork())
            {
                execlp(t1, t1, t2, t3, t4, NULL);
                perror(t1);
                /* code */
            }
            break;
        }
    }
}