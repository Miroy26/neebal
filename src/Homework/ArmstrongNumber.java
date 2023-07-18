package Homework;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter a 3 digit number");
		int a=sc.nextInt();
		int digit1=a%10;
		int digit2=(a/10)%10;
		int digit3=a/100;
		double b= Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3);
		if(a==b) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}

	}

}
