/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author hanife
 */
public class Bisiklet {
    public int vites;
    public int hiz;
    public Bisiklet()
    {
        vites=0;
        hiz=0;
    }
    public Bisiklet(int vites,int hiz)
    {
        setVites(vites);
        setHiz(hiz);
    }
    public void setVites(int vites)
    {
        this.vites=vites;
    }
    public void setHiz(int hiz)
    {
        this.hiz=hiz;
    }
    public String BisikletBilgi()
    {
        return " Vites : " + vites + " Hiz : " + hiz;
    }
}
