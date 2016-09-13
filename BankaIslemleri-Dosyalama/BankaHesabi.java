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
public class BankaHesabi {
    private String ad;
    private String soyad;
    private int hesapNo;
    private double bakiye;
    public BankaHesabi(String ad,String soyad,int hesapNo,double Bakiye)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
    }
    public void setAd(String ad)
    {
        this.ad=ad;
    }
    public String getAd()
    {
        return ad;
    }
    public void setSoyad(String soyad)
    {
        this.soyad=soyad;
    }
    public String getSoyad()
    {
        return soyad;
    }
    public void setHesapNo(int hesapNo)
    {
        this.hesapNo=hesapNo;
    }
    public int getHesapNo()
    {
        return hesapNo;
    }
    public void setBakiye(double bakiye)
    {
        this.bakiye=bakiye;
    }
    public double getBakiye()
    {
        return bakiye;
    }
    public void ParaYatir(double miktar)
    {
        bakiye=bakiye+miktar;
    }
    public void ParaCek(double miktar)
    {
        bakiye=bakiye-miktar;
    }
    public double BakiyeSorgula()
    {
        return bakiye;
    }
    public void ParaTransferiYap(double miktar,BankaHesabi alici)
    {
        ParaCek(miktar);
        alici.ParaYatir(miktar);
    }
    
}