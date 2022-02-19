import java.io.*;
public class num
{
    public static void main(String[] args) {
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;

        try {
            File infile=new File("");   //soucre file location
            File outfile=new File("");  //destination file location 

            inputStream=new FileInputStream(infile);
            outputStream=new FileOutputStream(outfile);

            InputStreamReader isread=new InputStreamReader(inputStream);
            BufferedReader reader= new BufferedReader(isread);
            StringBuffer sb=new StringBuffer();

            String str;
            byte[] buffer = new byte[1024];
            int length;

            while((str=reader.readLine())!=null){
                sb.append(str);
            }

            for(int i=0;i< sb.length();i++)
            {
                char c = sb.charAt(i);
                // if(Character.isDigit(c))  //to print only digits
                if(!Character.isDigit(c))  //to print only string
                {
                    String newfile= String.valueOf(c);
                    byte[] out=newfile.getBytes();
                    System.out.print(newfile);
                    outputStream.write(out);
                }
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}