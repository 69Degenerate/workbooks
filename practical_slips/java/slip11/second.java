// Write a menu driven program to perform the following operations
// i. Calculate the volume of the cylinder. (hint : Volume: π × r2 × h)
// ii. Find the factorial of a given number.
// iii. Check if the number is Armstrong or not.
// iv. Exit 

import java.util.*;
import java.util.function.Function;
import java.math.*;

class second
{


   static void volume()
   {
    System.out.println("\n____________calculate volume of cylinder____________\n");
    Scanner v=new Scanner (System.in);
    System.out.println("Enter Radius:");
    int r=v.nextInt();
    System.out.println("Enter height:");
    int h=v.nextInt();
    double p=3.14285714286;
    double vol=p*(r*r)*h;
    System.out.print("volume of cylinder:"+vol);
   }

   static void fact()
   {
       System.out.println("\n_____________________Factoriar of number___________________\n");
       int i,fact=1;
       Scanner v=new Scanner (System.in);
       System.out.println("Enter number :");
       int n=v.nextInt();  
       for(i=1;i<=n;i++)
       {    
            fact=fact*i;    
       }    
       System.out.println("Factorial of "+n+" is: "+fact);
   }

   static void Armstrong()
   {
        System.out.println("\n _____________________armstrong number___________________\n");
        int a,arm=0,temp;
        Scanner v=new Scanner (System.in);
        System.out.println("Enter number :");
        int n=v.nextInt(); 
        temp=n;
        while(n!=0)
        {
            a=n%10;
            arm=arm+(a*a*a);
            n=n/10;
        }
        if(arm==temp)
        System.out.println(temp+" is a armstrong number ");
        else
        System.out.println(temp+" is not a armstrong number ");
   }
    public static void main(String args[])
    {
        lp : while(true)
        {
            System.out.println("\n____________hello____________");
            System.out.print("\n intere select operation from following:\n1)Enter 1 for calculate the volume of the cylinder:\n2)Enter 2 for calculate the factorial of the cylinder:\n3) Enter 3 check the number is Armstrong or not:\n4) Exit");
            System.out.print("\n Enter your choise : ");
            Scanner  s1=new Scanner(System.in);
            int accept =s1.nextInt();
            switch(accept)
            {
                case 1:        
                   volume();
                   break;
                
                case 2:
                    fact();
                    break;
    
                case 3:
                    Armstrong();
                    break;
                case 4:
                    break lp;

                default:
                    System.out.println("Invalid choice! Please make a valid choice. \n\n");
                  
            }    
        }
    }
}
