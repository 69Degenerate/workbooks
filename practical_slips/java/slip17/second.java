// Write a java program to accept n employee names from users. Sort them in
// ascending order and Display them.(Use array of object and Static keyword) 

 
import java.util.Scanner;
  
class second
{
    public static void main(String args[])
    {
        String temp;
        Scanner SC = new Scanner(System.in);
         
        System.out.print("Enter the number of employee names: ");
        int N= SC.nextInt();
        SC.nextLine(); 
        String names[] = new String[N];
             
        System.out.println("Enter names: ");
        for(int i=0; i<N; i++)
        {
            System.out.print("Enter employee name [ " + (i+1) +" ]: ");
            names[i] = SC.nextLine();
        }
             
        //sorting strings 
         
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         
         
        System.out.println("\nSorted Employee names in Ascending Order: ");
        for(int i=0;i<N;i++)
        {
            System.out.println(names[i]);
        }
    }
}
