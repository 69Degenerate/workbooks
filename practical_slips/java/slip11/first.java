//Write a program to find the cube of a given number using the function interface.

import java.util.Scanner;

public class first
{
   public static void main(String args[])
   {
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println("Cube of the given number is "+(num*num*num));
   }
}