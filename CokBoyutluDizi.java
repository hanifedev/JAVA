package Ders;

import java.util.Scanner;

public class CokBoyutluDizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]tablo=new int[5][3];
		Scanner tara=new Scanner(System.in);
		for (int i=0; i<=4; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.println("dizinin elemanlarini giriniz");
				tablo[i][j]=tara.nextInt();
			}
		}
		elemanYaz(tablo);
		satirToplami(tablo);
		sutunToplami(tablo);
	}
	
	public static void elemanYaz(int[][]dizi)
	{
	for (int i=0; i<=4;i++)
	{
		for(int j=0; j<=2; j++)
		{
			System.out.print(dizi[i][j]+ " ");
		}
		System.out.println();
	}
	}
	public static void satirToplami(int[][]dizi)
	{
		for (int i=0; i<=4; i++)
		{
			int toplam=0;
			for (int j=0; j<=2; j++)
			{
				toplam=toplam+dizi[i][j];
			}
			System.out.println(i+1  + "satir toplami :" + toplam);
		}
	}
	public static void sutunToplami(int[][]dizi)
	{
		int toplam=0;
		for(int j=0; j<=2; j++)
		{
			for(int i=0;i<=4; i++)
			{
				toplam=toplam+dizi[i][j];
			}
			System.out.println(j+1 + "Sutun toplami :  " + toplam);
		}
	}
}
