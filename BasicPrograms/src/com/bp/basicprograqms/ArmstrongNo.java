package com.bp.basicprograqms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		
		
		/* Armstrong number= An Armstrong number of three digits
		   is an integer such that the sum of the cubes of 
				   its digits is equal to the number itself.
				    For example, 153 is an Armstrong number
				  since 1^3 + 5^3 + 3^3 = 1+ 125+ 27 = 153.  
				
			        153 ->  1       5      3
				       1*1*1 + 5*5*5 + 3*3*3
				       1     +  125  + 27
				       153
				       
				       
				       
				    370 ->3*3 + 7*3 + 0*3 = 370    
				       
				       */
		   
			int n,sum=0,rem,c;
			System.out.println("Enter any number=");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			c=n;
			while(n>0)
			{
				rem=n%10;
				sum=(rem*rem*rem)+sum;
				n=n/10;
				
			}
				if(c==sum)
					System.out.println("Armstrong Number");
				else
					System.out.println("not Armstrong number");
				
	}

}
