package Homework;
import java.util.Scanner;

public class Conversionofdaysintoyears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter time in days");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int years=a/365;
		a=a%365;
		int months=a/30;
		a=a%30;
		int weeks=a/7;
		a=a%7;
		int days=a;
		System.out.println(years+" years :"+months+" months :"+weeks+" weeks :"+days+" days");
		

	}

}
