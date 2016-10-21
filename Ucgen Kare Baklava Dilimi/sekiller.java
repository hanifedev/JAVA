/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author hanife
 */
public class Ucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=6;i>=0;i--){
            System.out.print("");
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
         for (int i=1;i<=5;i++)
         { for (int j=1;j<=5-i;j++)
            System.out.print(" "); 
           for (int j=1;j<=2*i-1;j++) 
            { 
                if (j==1 || j==2*i-1)
                    System.out.print("*"); 
                else 
                    System.out.print(" ");
            } 
            System.out.println(); 
         } 
         for (int i=5-1;i>=1;i--) 
         {
         for (int j=1;j<=5-i;j++) 
            System.out.print(" "); 
         for (int j=1;j<=2*i-1;j++) 
         { 
         if (j==1 || j==2*i-1) 
            System.out.print("*"); 
         else 
            System.out.print(" "); 
} 
         System.out.println(); 
        }
         
          for (int i=1;i<=5;i++)
         { for (int j=1;j<=5-i;j++)
            System.out.print(" "); 
           for (int j=1;j<=2*i-1;j++) 
             System.out.print("*"); 
           System.out.println(); 
         } 
         for (int i=5-1;i>=1;i--) 
         {
         for (int j=1;j<=5-i;j++) 
            System.out.print(" "); 
         for (int j=1;j<=2*i-1;j++) 
         { 
            System.out.print("*"); 
} 
         System.out.println(); 
        }   
    }
}
