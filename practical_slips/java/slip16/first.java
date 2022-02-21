// Write a java program to calculate the sum of digits of a given number using
// recursion. 
import java.io.*;
import java.util.*;
 
class first
{
    // Function to check sum
    // of digit using recursion
    static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
 
    // Driven Program to check above
    public static void main(String args[])
    {
        // int num = 12345;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int result = sum_of_digit(n);
        System.out.println("Sum of digits in " +
                           n + " is " + result);
    }
}
 