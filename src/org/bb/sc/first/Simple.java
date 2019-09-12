package org.bb.sc.first;

import java.util.Scanner;

public class Simple {

	public void dataBase() {
		Scanner scan=new Scanner(System.in);
		System.out.println(" --------Enter the database-----");
		System.out.println("Enter the name;");
		String name=scan.nextLine();
		System.out.println("Enter the Id:");
		int id=scan.nextInt();
		System.out.println("Enter the Salary:");
		double d=scan.nextDouble();
		System.out.println("Enter the mob no:");
		long l=scan.nextLong();
		System.out.println("Name is:"+name);
		System.out.println("Id is :"+ id);
		System.out.println("Salary is:"+d);
		System.out.println("Mobile number:"+l);

	}
public static void main(String[] args) {
	Simple s=new Simple();
	s.dataBase();
}
}
