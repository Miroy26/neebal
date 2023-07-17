package com.gurukul.day1;
import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of the side");//My name is Miroy Parmar
Scanner sc=new Scanner(System.in);
int s= sc.nextInt();
double Area= (Math.sqrt(3)/4)*Math.pow(s, 2);
System.out.println("Area of the triangle is "+Area);

	}

}
