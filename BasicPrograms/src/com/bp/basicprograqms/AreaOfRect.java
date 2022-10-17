package com.bp.basicprograqms;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length=");
        Double length = sc.nextDouble();
        System.out.println("Enter The width=");
        Double width = sc.nextDouble();
        
        double area = length*width;
        
        System.out.println("Area of Rectangle="+area);
        

	}

}
