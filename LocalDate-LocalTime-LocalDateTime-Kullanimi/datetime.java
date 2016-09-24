/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.LocalTime;
import java.time.LocalDateTime;
/**
 *
 * @author hanife
 */
public class datetime {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t LOCALDATE SINIFI");
        LocalDate tarih=LocalDate.now();
        System.out.println("BUGÜNÜN TARİHİ : " + tarih);
        LocalDate brl=LocalDate.now(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlinde bugun : " + brl);
        LocalDate yilingunu=LocalDate.ofYearDay(1995, 330);
        System.out.println("1995'in 330. günü : " + yilingunu);
        LocalDate ilkgun=LocalDate.of(2016, Month.JANUARY, 1);
        System.out.println("2016nın ilk günü : " + ilkgun);
        System.out.println("\t LOCALTIME SINIFI");
        LocalTime zaman=LocalTime.now();
        System.out.println("simdiki zaman : " + zaman);
        LocalTime bz=LocalTime.of(23, 45);
        System.out.println("Belirtilen zaman : " + bz);
        LocalTime zmn=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlinde saat : " + zmn);
        System.out.println("\t LOCALDATETIME SINIFI");
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Saat ve tarih : " + dt);
        LocalDateTime trh=LocalDateTime.of(2016, Month.SEPTEMBER, 24, 23, 40);
        System.out.println("Belirlenen tarih ve saat : " + trh);    
    }
}