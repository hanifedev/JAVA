package Deneme;

import java.util.Scanner;

public class DinamicCutRod {

	public static void main(String[] args) {
		int n;
		Scanner tara=new Scanner(System.in);
		System.out.println("cubuk uzunlugunu giriniz");
		n=tara.nextInt();
		int[] p= {1,5,8,9,10,17,17,20,24,30};
		System.out.println("Kazanç : " + memoizedCutRod(p,n));
	}
	public static int memoizedCutRodAux(int p[], int n, int r[])
	{
		int q;
		if(r[n] >= 0)
			return r[n];
		if( n == 0)
			q = 0;
		else 
			q = -1;
			for( int i=1; i<=n; i++)
			{
				q=Math.max(q, p[i-1]+memoizedCutRodAux(p, n-i, r));
			}
		r[n]=q;
		return q;
	}
	
	public static int memoizedCutRod(int p[],int n)
	{
		int[]r = new int[n+1];
		for(int i=0; i<=n; i++)
		{
			r[i]=-1;
		}
		return memoizedCutRodAux(p,n,r);
	}
}
