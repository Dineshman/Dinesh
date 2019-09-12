package org.bb.sc.first;

import java.util.Scanner;

public class ForClass {
	
	public void getNumber()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("----For Loop");
		System.out.println("Enter the number:");
		int n=t.nextInt();
		System.out.println("Iterate value");
		for(int i=n;i>=0;i--)
		{
			System.out.println(i);
		}
		
	}
public static void main(String[] args)
{
	ForClass f=new ForClass();
	f.getNumber();
}
}
