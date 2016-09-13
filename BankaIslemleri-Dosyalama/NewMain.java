/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

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
        DosyaIslemleri islm=new DosyaIslemleri();
        islm.DosyaOlustur();
        islm.DosyayaYaz();
        islm.DosyaKapat();
    }
    
}
