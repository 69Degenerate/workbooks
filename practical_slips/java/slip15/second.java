// Write a java program to search given name into the array, if it is found then display
// its index otherwise displays appropriate message. 

import java.util.*; 
class second { 
    public static void main(String[] args) 
    { 
      String[] strArray = { "sam","jeremi","john","dunkan" };
        boolean found = false;
        int index = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("search the name::");
        String search = s.nextLine();
       for (int i = 0; i <strArray.length; i++) 
       {
            if(search.equals(strArray[i])) 
            {
                index = i;
                found = true; 
                break;
            }
        }
       if(found)
          System.out.println(search +" found at the index "+index);
        else
          System.out.println(search +" not found in the array");
 
    }
}