package com.bp.basicprograqms;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Perfect no= perfect num, a positive integer that is equal to 
//		the sum of its proper divisiors.the smallest perfect no. is 6.
//		
//		6 = 1 + 2 + 3 = 6 (it is a perfect no.)
//


int n,sum=0;
System.out.println("Enter Any Number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
		
	}
}
if(n==sum)
	System.out.println("Perfect Number");
else
	System.out.println("Not Perfect Number");
	

	}

}
