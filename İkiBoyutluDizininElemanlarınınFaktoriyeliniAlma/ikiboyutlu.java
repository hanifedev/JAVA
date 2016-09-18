/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;

/**
 *
 * @author hanife
 */
public class ikiboyutlu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,j=0;
        double [][]dizi=new double[3][3];
        Scanner tara=new Scanner(System.in);
        System.out.println("Dizinin elemenlarını giriniz");
        for (i=0; i<3; i++)
        {
            {
                for (j=0; j<3; j++)
                {
                    dizi[i][j]=tara.nextDouble();
                }
            }
        }
        //DİZİ
        for (i=0;i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.print(dizi[i][j]+"     ");
            }
            System.out.println();
        }
            
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
              double sayi=dizi[i][j];
              dizi[i][j]=faktoriyel(sayi);
              System.out.print(sayi + "!=" + dizi[i][j] + "          ");
            }
            System.out.println();
        }
    }
    public static double faktoriyel(double n)
    {
        double f=1.0;
        for (int i=1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
}
