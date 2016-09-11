/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hanife
 */
public class Ogrenci {
    private String ad;
    private String soyad;
    private int no;
    private int yas;
    public Ogrenci()
    {
        ad="";
        soyad="";
        no=0;
        yas=0;
    }
    public Ogrenci(String ad,String soyad,int no,int yas)
    {
        this.ad=ad;
        this.soyad=soyad;
        setNo(no);
        setYas(yas);
    }
    public String getAd()
    {
        return ad;
    }
    public void setAd(String ad)
    {
        this.ad=ad;
    }
    public String getSoyad()
    {
        return soyad;
    }
    public void setSoyad(String soyad)
    {
        this.soyad=soyad;
    }
    public int getNo()
    {
        return no;
    }
    public void setNo(int no)
    {
        if (no<0)
            System.out.println("Yanlış numara girdiniz");
        else
            this.no=no;
    }
    public int getYas()
    {
        return yas;
    }
    public void setYas(int yas)
    {
        if (yas<0)
            System.out.println("Yanlış yaş girdiniz");
        else
            this.yas=yas;
    }
}