/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author hanife
 */
public class DosyaYaz {
    private PrintWriter yaz;
    public void dosyaOlustur()
    {
        try
        {
        yaz=new PrintWriter("Ogrenci.txt");    
        }
        catch(FileNotFoundException dosya)
        {
            System.err.println("Dosya oluşturulamadı");
            System.exit(1);
        }
    }
    public void kayitEkle()
    {
        Ogrenci ogr1=new Ogrenci("Hanife","Kurnaz",1234,20);
        yaz.println(ogr1.getAd());
        yaz.println(ogr1.getSoyad());
        yaz.println(ogr1.getNo());
        yaz.println(ogr1.getYas());
        Ogrenci ogr2=new Ogrenci("Deneme","Soyad",12345,23);
        yaz.println(ogr2.getAd());
        yaz.println(ogr2.getSoyad());
        yaz.println(ogr2.getNo());
        yaz.println(ogr2.getYas());
    }
    public void dosyaKapat()
    {
        if (yaz!=null)
            yaz.close();
    }
}
