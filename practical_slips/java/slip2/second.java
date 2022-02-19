import java.io.*;
import java.lang.*;
public class second {
    abstract class Shape
    {
        float pi=3.14f;
        abstract void area();
        abstract void volume();
    }
    class Cone extends Shape
    {
        int red,side,height;
        Cone(int r,int s,int h)
        {
            red=r;
            side=s;
            height=h;
        }
        void area()
        {
            float a=pi*red*side;
            System.out.println("Area of Cone-"+a);
        }
        void volume()
        {
            float v=pi*red*red*(height/3);
            System.out.println("Volume of Cone-"+v);
        }
    }
    class Cylinder extends Shape
    { 
        int red ,height;
        Cylinder(int r,int h)
        {
            red=r;
            height=h;
        }
        void area()
        {
            float a1=2*pi*red*height+2*pi*red*red;
            System.out.println("Area of Cylinder-"+a1);
        }
        void volume()
        {
            float v1=pi*red*red*height;
            System.out.println("Volume of Cylinder-"+v1);
        }
    }
    class ShapeDemo1
    {
        public static void main(String arg[])
        {
            int r,s,h;
            DataInputStream din=new DataInputStream(System.in);
            try
            {
                System.out.println("Enter the values of Redius, Side , height-");
                r=Integer.parseInt(din.readLine());
                s=Integer.parseInt(din.readLine());
                h=Integer.parseInt(din.readLine());
                Cone c1=new Cone(r,s,h);
                c1.area();
                c1.volume();
                Cylinder c2=new Cylinder(r,h);
                c2.area();
                c2.volume();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
