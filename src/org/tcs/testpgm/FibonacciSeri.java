package org.tcs.testpgm;

public class FibonacciSeri {
	public static void main(String[] args) {
		int a=0, b=1, c,count=10,i;
		System.out.println(""+a);
		System.out.println(""+b);
		for(i=2;i<=10;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}

}
