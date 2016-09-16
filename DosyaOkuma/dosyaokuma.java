/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.io.*;


/**
 *
 * @author hanife
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String satir="";
        String[]dizi=new String[satirSayisi()];
        try 
        {
            FileInputStream f=new FileInputStream("/home/hanife/son");
            DataInputStream d=new DataInputStream(f);
            BufferedReader b=new BufferedReader(new InputStreamReader(d));
            int i=0;
            while ((satir=b.readLine())!=null)
            {
                dizi[i]=satir;
                i++;
            }
            d.close();
        }
        catch(Exception hata)
        {
            System.err.println("Oluşan hata : " + hata.getMessage());
        }
        for (int i=0; i<dizi.length; i++)
        {
            System.out.println(dizi[i]);
        }
    }
    public static int satirSayisi()
    {
        int sayac=0;
        try
        {
            FileInputStream f=new FileInputStream("/home/hanife/son");
            DataInputStream d=new DataInputStream(f);
            BufferedReader b=new BufferedReader(new InputStreamReader(d));
            while (b.readLine()!=null)
            {
                sayac++;
            }
            d.close();
        }
        catch(Exception hata)
        {
            System.out.println("hata : " + hata.getMessage());
        }
        return sayac;
    }
}
