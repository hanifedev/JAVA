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
public class DagBisikleti extends Bisiklet{
    public int kltkYksklgi;
    public DagBisikleti()
    {
     super();
     kltkYksklgi=0;
    }
    public DagBisikleti(int vites,int hiz, int kltkYksklgi)
    {
        super(vites,hiz);
        setKltkYksklgi(kltkYksklgi);
    }
    public void setKltkYksklgi(int kltkYksklgi)
    {
        this.kltkYksklgi=kltkYksklgi;
    }
    @Override public String BisikletBilgi()
    {
        return super.BisikletBilgi() + " Koltuk Yüksekliği : " + kltkYksklgi;
    }
}
