package javaegitim;
import java.util.Random;
import java.util.Scanner;
public class JavaDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int sayi=r.nextInt(100);
		System.out.println("rastgele sayi :" + sayi);
		Scanner tara=new Scanner(System.in);
		System.out.println("Tahmininizi giriniz");
		int tahmin=tara.nextInt();
		while(tahmin!=sayi)
		{
			if (tahmin<sayi)
			{
				System.out.println("Daha büyük bir sayı giriniz");
				tahmin=tara.nextInt();
			}
			else if(tahmin>sayi)
			{
				System.out.println("Daha kücük sayı giriniz");
				tahmin=tara.nextInt();
			}
		}
		System.out.println("tebrikler");
	}
}
