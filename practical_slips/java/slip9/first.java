//Write a program to accept n names of country and display them in descending order

import java.util.*;
class second
{
         //declaration of array
	String a[];
	int n;
	second()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter how many countries you want to enter : ");
		n=s.nextInt();
               
                 //redeclartion of array
		a=new String[n];

		//To accept values
                for(int i=0;i<n;i++)
		{
			System.out.print("Enter countries: ");
			a[i]=s.next();
		}		
	}
        //To display values
	void display()
	{
		String temp="";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted Countries are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" \n");	
		}	
	}
}

//To create object 
class list
{
	public static void main(String args[])
	{
		second obj=new second();
		obj.display();
	}
}