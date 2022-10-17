package com.bp.basicprograqms;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	input no 121  == 121

		
		
		int n,sum=0,c,rem;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(c==sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome number");
		
	}

}
