/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.TreeSet;
import java.util.Iterator;
/**
 *
 * @author hanife
 */
public class treeset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean sayi;
        int [] dizi={1,2,3,4,5,6};
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for (int x : dizi)
        {
            sayi=ts.add(x);
        }
        Iterator<Integer> itr=ts.iterator();
        while(itr.hasNext())
            System.out.println(itr.next() + " ");
        }
}

