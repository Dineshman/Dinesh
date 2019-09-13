package org.tcs.testpgm;

import java.util.Scanner;

public class sumofeven {
	public static void main(String[] args) {
		int esum=0, osum=0,i;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				esum=esum+i;
			}
			else
			{
				osum=osum+i;
			}
		}
		System.out.println("Sum of even:"+esum);
		System.out.println("Odd of sum:"+osum);
	}

}
