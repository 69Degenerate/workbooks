// Write a Java program to calculate the area of Circle, Triangle & Rectangle.(Use
// Method Overloading)

import java.io.*;
class first
{
void findarea(int a, int b)
    {
       System.out.println( "\n Area of rectangle with breadth "+a+" and lenght " +b+ " is :" + a*b);
    }
  
void findarea(int a)
       {
         System.out.println( "\n Area of circle with  radius " +a+ " is :" + 3.14 * a);
       }
  
 void findarea(int a, int b, int c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "\n Area of triangle with lenght of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
 }
public static void main(String p[]) throws IOException
 {
     area d = new area();
     BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("\n Find area of \n 1 . Rectangle \n 2 . Triangle \n 3 . Circle \n\nSelect a choice : ");
     int choice =Integer.parseInt(Br.readLine());
  switch(choice)
  {
    case 1:
          System.out.print("\n Enter the breadth : ");
          int a =Integer.parseInt(Br.readLine());
          System.out.print("\n Enter the lenght : ");
          int b=Integer.parseInt(Br.readLine());
          d.findarea(a,b);
          break;
    case 2:
         System.out.print("\n Enter the lenght of first side : ");
         int x =Integer.parseInt(Br.readLine());
         System.out.print("\n Enter the lenght of second side : ");
         int y=Integer.parseInt(Br.readLine());
         System.out.print("\n Enter the lenght of third side : ");
         int z =Integer.parseInt(Br.readLine());
         d.findarea(x,y,z);
         break;
    case 3:
         System.out.print("\n Enter the radius : ");
         int r =Integer.parseInt(Br.readLine());
         d.findarea(r);
         break;
    default:
         System.out.println("Invalid choice");
      }
  }
}