package com.bp.basicprograqms;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Factorial number=  the product of an integer and all the integers below it; 
//        e.g. factorial four ( 4! ) is equal to 24.



int n,fact=1;
System.out.println("Enter Any number");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	 fact=fact*i;
	 
}
System.out.println("Factorial is "+fact);


	}

}
