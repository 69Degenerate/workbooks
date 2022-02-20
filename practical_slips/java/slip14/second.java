// Write a menu driven program to perform the following operations on
// multidimensional array ie matrix :
// i. Addition
// ii. Multiplication
// iii. Transpose of any matrix.
// iv. Exit 


import java.util.*;
import java.util.function.Function;
import java.math.*;

class second
{


   static void addition()
   {
        System.out.println("\n::::::: Addition of martix :::::::::  \n");    
        int row, col,i,j;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the number of rows");
        row = in.nextInt();
        System.out.println("Enter the number columns");
        col = in.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("Enter the elements of matrix1");
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            mat1[i][j] = in.nextInt();
            System.out.println();
        }
        System.out.println("Enter the elements of matrix2");
        for ( i= 0 ; i < row ; i++ )
        {
            for ( j= 0 ; j < col ;j++ )
            mat2[i][j] = in.nextInt();
            System.out.println();
        }
        for ( i= 0 ; i < row ; i++ )
        for ( j= 0 ; j < col ;j++ )
        res[i][j] = mat1[i][j] + mat2[i][j] ; 
        System.out.println("Sum of matrices:-");
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(res[i][j]+"\t");
            System.out.println();
        }
   }

   static void multiplication()
   {
        System.out.println("\n::::::: Multiplication of martix :::::::::  \n");
        int row, col,i,j;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the number of rows");
        row = in.nextInt();
        System.out.println("Enter the number columns");
        col = in.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("Enter the elements of matrix1");
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            mat1[i][j] = in.nextInt();
            System.out.println();
        }
        System.out.println("Enter the elements of matrix2");
        for ( i= 0 ; i < row ; i++ )
        {
            for ( j= 0 ; j < col ;j++ )
            mat2[i][j] = in.nextInt();
            System.out.println();
        }
        for ( i= 0 ; i < row ; i++ )
        for ( j= 0 ; j < col ;j++ )
        res[i][j] = mat1[i][j] * mat2[i][j] ; 
        System.out.println("multiplication of matrices:-");
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(res[i][j]+"\t");
            System.out.println();
        }
   }

   static void transpose()
   {
        System.out.println("\n ::::::::: Transpose of martix :::::::::\n");
        int row, col;

        Scanner s = new Scanner(System.in);
    
        System.out.print("Input number of rows: ");
        row = s.nextInt();
        System.out.print("Input number of rows: ");
        col = s.nextInt();
    
       
        int a[][] = new int[row][col];
        System.out.println("Enter elements of matrix a:");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] ? ");
            a[i][j] = s.nextInt();
          }
        }
    
        //print matrix a
        System.out.println("\n :::Original Matrix:::");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            System.out.print(a[i][j] + "\t");
          }
          System.out.print("\n");
        }
    
        //print matrix b
        System.out.println("\n ::::: Transpose Matrix ::::: ");
        for (int i = 0; i < col; i++) {
          for (int j = 0; j < row; j++) {
            System.out.print(a[j][i] + "\t");
          }
          System.out.print("\n");
        }
   }
    public static void main(String args[])
    {
        lp : while(true)
        {
            System.out.println("\n____________hello____________");
            System.out.print("\n intere select operation from following:\n"
                            +"1)Enter 1 for calculate Addition:\n"
                            +"2)Enter 2 for calculate Multiplication:\n"
                            +"3) Enter 3 Transpose of any matrix:\n"
                            +"4) Exit");
            System.out.print("\n Enter your choise : ");
            Scanner  s1=new Scanner(System.in);
            int accept =s1.nextInt();
            switch(accept)
            {
                case 1:        
                   addition();
                   break;
                
                case 2:
                    multiplication();
                    break;
    
                case 3:
                    transpose();
                    break;
                case 4:
                    break lp;

                default:
                    System.out.println("Invalid choice! Please make a valid choice. \n\n");
                  
            }    
        }
    }
}
