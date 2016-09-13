/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author hanife
 */
public class DosyaIslemleri {
    private PrintWriter writer;
    public void DosyaOlustur()
    {
        try
        {
            writer=new PrintWriter("banka.txt");
        }
        catch(FileNotFoundException dosya)
        {
            System.err.println("Dosya Oluşturulamadı");
            System.exit(3);
        }
    }
    public void DosyayaYaz()
    {
         BankaHesabi hsp1=new BankaHesabi("Hanife","Kurnaz",12456,500.0);
         BankaHesabi hsp2=new BankaHesabi("Ali","Veli",64534,0);
         hsp1.ParaYatir(500);
         writer.println(hsp1.getAd());
         writer.println(hsp1.getSoyad());
         writer.println(hsp1.getHesapNo());
         writer.println(hsp1.getBakiye());
         writer.println(hsp2.getAd());
         writer.println(hsp2.getSoyad());
         writer.println(hsp2.getHesapNo());
         writer.println(hsp2.getBakiye());
         writer.println("Hsp1 Bakiye : " + hsp1.BakiyeSorgula());
         writer.println("Hsp2 Bakiye : " + hsp2.BakiyeSorgula());
         hsp1.ParaTransferiYap(50, hsp2);
         writer.println("Kalan hsp1 Bakiyesi : " + hsp1.BakiyeSorgula());
         writer.println("Yeni hsp2 Bakiyesi : "+ hsp2.BakiyeSorgula());
    }
    public void DosyaKapat()
    {
        if (writer!=null)
            writer.close();
    }
}
