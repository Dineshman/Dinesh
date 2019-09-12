package org.bb.sc.first;

import java.util.Scanner;

public class NatNum {
	public void getNatNum()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=s1.nextInt();
		//int n=n1;
		int sum=0;
		//sum=((n1/2)*(n+1));
		for(int i=0; i<=n1;i++)
		{
		sum=sum+i;	
		}
		System.out.println("Sum of nar num:"+sum);
			
			
		}
		
	public static void main(String[] args)
	{
		NatNum na=new NatNum();
		na.getNatNum();
	}
	}


