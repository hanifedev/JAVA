/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author hanife
 */
public class obebokek {
    private int s1,s2;
    public void setS1(int s1)
    {
        this.s1=s1;
    }
    public int getS1()
    {
        return s1;
    }
    public void setS2(int s2)
    {
        this.s1=s1;
    }
    public int getS2()
    {
        return s2;
    }
    public int okek(int x,int y)
    {
        int okek=0,eb;
        if (x<=y)
            eb=y;
        else
            eb=x; 
        for (int i=eb;i<=x*y; i++)
        {
            if (i%x==0 && i%y==0)
            {
                okek=i;
                break;
            }
        }
        return okek;
     }
    public int obeb(int x,int y)
    {
        int obeb=0,ek;
        if (x<=y)
            ek=x;
        else
            ek=y;
        for (int i=ek; i>1; i--)
            {
                if(x%i==0 && y%i==0)
                {
                    obeb=i;
                    break;
                }
            }
        return obeb;
    }
}
