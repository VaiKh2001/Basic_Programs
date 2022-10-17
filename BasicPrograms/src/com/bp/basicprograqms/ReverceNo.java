package com.bp.basicprograqms;

import java.util.Scanner;

public class ReverceNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int num=sc.nextInt();
		int sum=0,rev;
		
		while(num!=0)
		{
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		System.out.println("Reverse=" +sum);
		
		
	}

}
