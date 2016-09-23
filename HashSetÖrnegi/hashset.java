/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author hanife
 */
public class hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean metn;
        String [] dizi={"a","b","c","d","e","f"};
        HashSet<String> ts=new HashSet<String>();
        for (String hash : dizi)
        {
            metn=ts.add(hash);
        }
        System.out.println("döngü ile de yazdırabiliriz");
        for (String hash : dizi)
        {    
            System.out.print(hash + "\t");
        }
        System.out.println();
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext())
            System.out.println(itr.next() + " ");
        }
        
        
}

