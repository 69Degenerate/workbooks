// Write a java program to accept the Employee name from the user and check whether
// it is valid or not. If it is not valid then throw a user defined Exception “Name is Invalid”
// otherwise display it.(Name should contain only characters) 


//not works as intended

package practical_slips.java.slip13;
import java.util.*;
class InvalidNameException extends Exception
{
}
class Slip11
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Name ");
String name=s.next();
try
{
for(int i=0;i {
int ch=(int)name.charAt(i);
if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
{
}
else
{
throw new InvalidNameException();
}
}
System.out.println("Employee Name is :"+name);
}
catch(InvalidNameException e)
{
System.out.println("Invalid user Name ");
}
}
}