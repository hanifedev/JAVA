/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


/**
 *
 * @author hanife
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dosya,path;
        System.out.println("Olusturmak istediginiz dosyanın yolunu ve adını giriniz");
        Scanner tara=new Scanner(System.in);
        dosya=tara.next();
        DosyaOlustur(dosya);
        System.out.println("Hangi dizinin içerisini görmek istersiniz");
        path=tara.next();
        Gor(path);
    }
    public static void DosyaOlustur(String fl)
        {
        File f=new File(fl);
        try
        {
            if(!f.exists())
            {
                f.createNewFile();
                System.out.println("dosya olusturuldu");
            }
            else
                System.out.println("Böyle bir dosya zaten var");
        }
        catch(IOException io)
        {
            io.printStackTrace();
        }
    }
    public static void Gor(String yol)
    {
        File root=new File(yol);
        File[] dizi=root.listFiles();
        for (File f : dizi)
        {
            if (f.isFile())
                System.out.println("Türü : Dosya ------- " + "Adı : " + f.getName());
            else
                System.out.println("Türü : Dizin ------- " + "Adı : " + f.getName());
        }
    }
    
}
