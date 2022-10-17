package com.bp.basicprograqms;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a=10 b=20
		// a=20 b=10
		
		
		int a,b,temp;
		System.out.println("Enter any two number");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping "+ a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping "+ a+" "+b);
	}
	

}
