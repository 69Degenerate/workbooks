#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <dirent.h>
#include <fcntl.h>
void list(char c, char *dn)
{
    DIR *dir;
    int i, cnt = 0;
    struct dirent *entry;
    struct stat buff;
    if ((dir = opendir(dn)) == NULL)
    {
        printf("File not found:", dn);
        return;
    }
    switch (c)
    {
    case 'f':
        while ((entry = readdir(dir)) != NULL)
        {
            stat(entry->d_name, &buff);
            if (S_IFREG & buff.st_mode)
            {
                printf("%s\n", entry->d_name);
            }
        }
        break;
    case 'n':
        while ((entry = readdir(dir)) != NULL)
        {
            cnt++;
            printf("The no of entries =%d", cnt);
        }
        break;
    case 'i':
        while ((entry = readdir(dir)) != NULL)
        {
            stat(entry->d_name, &buff);
            if (S_IFREG & buff.st_mode)
            {
                printf("%s\t %d \n", entry->d_name, &buff.st_ino);
            }
        }
        break;
    }
    closedir(dir);
}
main()
{
    char command[80], t1[20], t2[20], t3[20], t4[20];
    int n;
    system("clear");
    while (1)
    {
        printf("myshell$");
        fflush(stdin);
        fgets(command, 80, stdin);
        n = sscanf(command, "%s %s %s %s", t1, t2, t3, t4);
        switch (n)
        {
        case 1:
            if (!fork())
            {
                execlp(t1, t1, NULL);
                perror(t1);
            }
            break;
        case 2:
            if (!fork())
            {
                execlp(t1, t1, t2, NULL);
                perror(t1);
            }
            break;
        case 3:
            if (strcmp(t1, "list") == 0)
            {
                list(t2[0], t3);
            }
            else
            {
                if (!fork())
                {
                    execlp(t1, t1, t2, t3, NULL);
                    perror(t1);
                }
            }
            break;
        case 4:
            if (!fork())
            {
                execlp(t1, t1, t2, t3, t4);
                perror(t1);
            }
            break;
        }
    }
}