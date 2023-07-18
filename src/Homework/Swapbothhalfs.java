package Homework;
import java.util.Scanner;

public class Swapbothhalfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4 digit number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int digit1=a%100;
		int digit2=(a/100);
	
		int b= digit1*100+digit2;
		System.out.println("The swaped number is "+b);

	}

}
