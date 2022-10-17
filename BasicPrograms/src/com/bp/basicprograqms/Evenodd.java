package com.bp.basicprograqms;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Any Number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Entered no.is an even number..");
		}
		else
		{
			System.out.println("Entered no. is an odd number..");
		}
		
	}

}
