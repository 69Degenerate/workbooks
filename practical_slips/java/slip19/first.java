

//Write a Java program to display Fibonacci series using a function.

import java.util.*;
class first
{

	static void Fibonacci(int n)
	{
		int num1 = 0, num2 = 1;

		int counter = 0;

		while (counter < n) {

			// Print the number
			System.out.print(num1 + " ");

			// Swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}


	public static void main(String args[])
	{
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number::");
		int n = s.nextInt();
		Fibonacci(n);
	}
}
