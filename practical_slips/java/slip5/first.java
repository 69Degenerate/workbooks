public class first {  
    public static void main(String[] args) {      
          
        int [] arr = new int [] {5, 4, 3, 2, 1, 0};   
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        System.out.println();  
          
        System.out.println("Array in reverse order: ");   
        for (int i = arr.length-1; i >= 0; i--) {   
            System.out.print(arr[i] + " ");   
        }    
    }  
}  