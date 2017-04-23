package Deneme;

import java.util.Scanner;


public class CutRod {

	public static void main(String[] args) {
		int n;
		Scanner tara=new Scanner(System.in);
		System.out.println("cubuk uzunlugunu giriniz");
		n=tara.nextInt();
		int[] p= {1,5,8,9,10,17,17,20,24,30};
		System.out.println("Kazanç : " + cutrod(p,n));
	}
	
	public static int cutrod(int p[], int n)
	{
		int q;
		if(n==0)
			return 0;
		q=-1;
		for(int i=1; i<=n; i++)
		{
			q=Math.max(q,p[i-1]+cutrod(p, n-i));
		}
		return q;
	}
}
