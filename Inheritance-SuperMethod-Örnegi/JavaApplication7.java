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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bisiklet bycle=new Bisiklet(18,20);
        DagBisikleti mbycle=new DagBisikleti(21,20,25);
        System.out.println(" BİSİKLET : " + bycle.BisikletBilgi());
        System.out.println(" DAG BİSİKLETİ : " + mbycle.BisikletBilgi());
    }
    
}
