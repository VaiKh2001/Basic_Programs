package com.bp.basicprograqms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PrimeNumber= A number that can be divided exactly only by itself and 1. 
//		
//		for Example 7,17,41.


int n,count=0;
System.out.println("Enter Any Number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
if(count==2)
	System.out.println("Prime Number");
else
	System.out.println("Not Prime Number ");



	}

}
