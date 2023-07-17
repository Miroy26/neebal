package com.gurukul.day1;

import java.util.Scanner;

public class Reverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 3 digit number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
int digit1=a%10;
int digit2=(a/10)%10;
int digit3=a/100;
int b=digit1*100+digit2*10+digit3*1;
int sum=a+b;
System.out.println("Reverse of a is"+b);
System.out.println("Sum is"+sum);
	}
}
