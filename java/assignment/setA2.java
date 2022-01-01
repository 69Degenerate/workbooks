import java.util.*;

class setA2 
{
    public static void main(String [] args)
    {
        System.out.println("_______________________________________");
        Scanner s= new Scanner(System.in);
        System.out.println("enter the lenght:");
        int lenght=s.nextInt();
        System.out.println("enter the breadth:");
        int breadth=s.nextInt();
        int area=lenght*breadth;
        int para=2*(lenght+breadth);
        System.out.println("area :"+area);
        System.out.println("parameter :"+para);


    }
}
