import java.io.*;
class NumberZero extends Exception
{
      NumberZero()
      {}
}
class Number
{
      static int no;
      Number() throws IOException
      {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter no");
            no=Integer.parseInt(br.readLine());
            try
            {  
   if(no==0)
                  {
                  throw new NumberZero();
                  }
            cal();
            }//end of try
            catch(NumberZero e)
            {
                  System.out.println("number is zero");
            }
      }
      void cal() 
      {   
  int l=0,r=0;
            l = no%10;
            //System.out.println("no = "+no);
            if(no>9)
            {
                  while(no>0)
                  {
                  r = no%10;
                  }
            System.out.println("Addotion of first and last digit = "+(l+r));
                              }
            else
            System.out.println("Addotion of first and last digit = "+l);
      }
}
class second
{
      public static void main(String a[]) throws IOException
      {   
  Number n= new Number();
      }
}