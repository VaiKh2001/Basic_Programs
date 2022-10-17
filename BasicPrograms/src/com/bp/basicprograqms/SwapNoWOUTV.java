package com.bp.basicprograqms;

import java.util.Scanner;

public class SwapNoWOUTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap two no. without using third variable
		
		int a,b;
		System.out.println("Entewr Any Two Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping "+a+" "+b );
		
		

	}

}
