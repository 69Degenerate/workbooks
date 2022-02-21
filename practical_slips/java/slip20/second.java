// Write a java program to accept a number from user, If it is greater than 1000 then
// throw user defined exception “Number is out of Range” otherwise display the factors of
// that number. (Use static keyword) 



import java.io.*;
import java.util.*;

class second
{
    public static void main(String[] args)
    {
        System.out.println("\n_____________________Factoriar of number___________________\n");
        int i,fact=1;
        Scanner v=new Scanner (System.in);
        System.out.println("Enter number :");
        int n=v.nextInt();
        if(n>1000)
        {
            System.out.println("Number is out of Range");
        }
        else
        {
            for(i=1;i<=n;i++)
            {    
                fact=fact*i;    
            }    
            System.out.println("Factorial of "+n+" is: "+fact);
        }
    }
}