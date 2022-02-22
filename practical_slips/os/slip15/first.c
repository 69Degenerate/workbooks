/*
Write a C program that behaves like a shell which displays the command
prompt ‘myshell$’. It accepts the command, tokenize the command line
and execute it by creating the child process. Also implement the
additional command ‘search’ as myshell$ search f filename pattern : It
will search the first occurrence of pattern in the given file myshell$
search a filename pattern : It will search all the occurrence of pattern in
the given file myshell$ search c filename pattern : It will count the
number of occurrence of pattern in the given file 
*/

#include<stdio.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<unistd.h>
#include<dirent.h>
#include<fcntl.h>
#include<string.h>
void search(char c,char *s,char *fn)
{
int handle,i=1,cnt=0,j=0;
char ch,buff[80],*p;
if((handle=open(fn,O_RDONLY))==-1)
{
printf("File not found:",fn);
return;
}
switch(c)
{
case 'f':
while(read(handle,&ch,1)!=0)
{
if(ch=='\n')
{
buff[j]='\0';
j=0;
if(strstr(buff,s)!=NULL)
{
printf("%d%s\n",i,buff);
break;
}
i++;
}
else
buff[j++]=ch;
}
break;
case 'c':
while(read(handle,&ch,1)!=0)
{
if(ch=='\n')
{
buff[j]='\0';
j=0;
if(strstr(buff,s)!=NULL)
{
p=buff;
while((p=strstr(p,s))!=NULL)
{
cnt++;
p++;
}
}
}
else
buff[j++]=ch;
}
printf("Total no of occurences=%d\n",cnt);
break;
case 'a':
while(read(handle,&ch,1)!=0)
{
if(ch=='\n')
{
buff[j]='\0';
j=0;
if(strstr(buff,s)!=NULL)
printf("%d%s\n",i,buff);
i++;
}
else
buff[j++]=ch;
}
break;
}
}
main()
{
char cammand[80],t1[20],t2[20],t3[20],t4[20];
int n;
system("clear");
while(1)
{
printf("myshell$");
fflush(stdin);
fgets(cammand,80,stdin);
n=sscanf(cammand,"%s %s %s %s",t1,t2,t3,t4);
switch(n)
{
case 1:
if(!fork())
{
execlp(t1,t1,NULL);
perror(t1);
}
break;
case 2:
if(!fork())
{
execlp(t1,t1,t2,NULL);
perror(t1);
}
break;
case 3:
if(!fork())
{
execlp(t1,t1,t2,t3,NULL);
perror(t1);
}
break;
case 4:
if(strcmp(t1,"search")==0)
search(t2[0],t3,t4);
else
{
if(!fork())
{
execlp(t1,t1,t2,t3,t4,NULL);
perror(t1);
}
}
break;
}
}
}