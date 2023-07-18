package Homework;
import java.util.Scanner;
public class Conversionoftime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter time in milliseconds");
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int hours=t/(1000*60*60);
t=t%(1000*60*60);
int minutes=t/(1000*60);
t=t%(1000*60);
int seconds=t/(1000);
System.out.println("The time is "+hours+":"+minutes+":"+seconds);
	}

}
