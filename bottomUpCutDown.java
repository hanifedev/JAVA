package Deneme;

import java.util.Scanner;

public class BottomUpCutDown {

	public static void main(String[] args) {
		int n;
		Scanner tara=new Scanner(System.in);
		System.out.println("cubuk uzunlugunu giriniz");
		n=tara.nextInt();
		int[] p= {1,5,8,9,10,17,17,20,24,30};
		System.out.println("Kazanç : " + bottomUpCutDown(p,n));

	}
	
	public static int bottomUpCutDown(int p[],int n)
	{
		int q;
		int[] r = new int[n+1];
		r[0]=0;
		for( int j=1; j<=n;j++)
		{
			q=-1;
			for(int i=1; i<=j; i++)
			{
				q=Math.max(q, p[i-1]+r[j-i]);
			}
			r[j]=q;
		}
		return r[n];
	}
}
