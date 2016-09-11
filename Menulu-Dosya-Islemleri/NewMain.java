/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author hanife
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuGoster();
    }
    public static void MenuGoster()
    {
        DosyaYaz metinDosyasi=new DosyaYaz();
        int sec=0;
        Scanner tara=new Scanner(System.in);
        while(sec!=4)
        {
          System.out.println("Yapmak istediğiniz işlemi seçiniz: 1. DOSYA OLUŞTUR - 2. KAYIT EKLE - 3. DOSYA KAPAT - 4. ÇIKIŞ");
          sec=tara.nextInt();
          if (sec==1)
          {
              metinDosyasi.dosyaOlustur();
              System.out.println("Dosya oluşturuldu");
          }
          else if (sec==2)
          {
              metinDosyasi.kayitEkle();
              System.out.println("Kayit eklendi");
          }
          else if (sec==3)
          {
              metinDosyasi.dosyaKapat();
              System.out.println("Dosya kapatıldı");
          }
          else if (sec==4)
          {
              System.out.println("İşlemleriniz yapıldı programdan çıkıyorsunuz");
              break;
          }
          else
          {
              System.out.println("Yanlış seçim yaptınız");
          }
        }
          
        }
    
}