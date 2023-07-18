package Homework;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter units");
		int units=sc.nextInt();
		if(units<100) {
			amount=units*4;
		}
		else if(units<300) {
			amount=(units-100)*5+(100*4);
		}
		else {
			amount=(units-300)*10+(200*5)+(100*4);
		}
		if(amount>1000) {
			amount=1000+(amount*5)/100;
		}
		amount=amount+18*amount/100;
		System.out.println("Name: "+name);
		System.out.println("Units: "+units);
		System.out.println("Amount: "+amount);
		
		

	}

}
