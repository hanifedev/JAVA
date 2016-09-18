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
public class matriscarpim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a=new int [][]{
            {6,2},{-3,2},{1,4}};
        int [][]b=new int[][]{
            {2,5,-2,1},{3,-1,2,3}
        };
        int [][]c=new int[3][4];
        //MATRİSLER//
        System.out.println("A matrisi");
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("B matrisi");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        //ÇARPIM
        for (int k=0; k<4; k++)
        {
            for (int i=0; i<3; i++)
            {
                c[i][k]=0;
                for (int j=0; j<2; j++)
                {
                    c[i][k]+=a[i][j]*b[j][k];
                }
            }
        }
        System.out.println("C matrisi");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
            
    }
    
}
