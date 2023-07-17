package com.gurukul.day1;
import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter distance in kms");
		Scanner sc=new Scanner(System.in);
		int kms=sc.nextInt();
		long metres=1000*kms;
		long cms=metres*100;
		double inches=cms/2.54;
		double feet=inches/12;
		System.out.println("Distance in metres is "+metres);
		System.out.println("Distance in cms is "+cms);
		System.out.println("Distance in feet is "+feet);
		System.out.println("Distance in inches is "+inches);
		

	}

}
