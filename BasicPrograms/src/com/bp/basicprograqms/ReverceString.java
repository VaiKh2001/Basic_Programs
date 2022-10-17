package com.bp.basicprograqms;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String rev=" ";
		System.out.println("Enter a String");
		
		String org=sc.nextLine();
		
		
		int lenght;
		for(int i=org.length()-1; i>=0; i--)
		
			rev=rev+org.charAt(i);
		System.out.println("reverse string is "+rev);
		
	}

}
