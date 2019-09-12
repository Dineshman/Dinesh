package org.bb.sc.first;

import java.util.Scanner;

public class CondiState {
	public void getMark()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mark;");
		int m=s.nextInt();
		System.out.println("Mark is :"+m);
	
		if(m>=35)
		{
System.out.println("Congrats you are pass");		
		
	}
		else
		{
			System.out.println("Sorry you are fail");
		}
	}
	
	public static void main(String[] args)
	{
		CondiState c=new CondiState();
		c.getMark();
	}

}
