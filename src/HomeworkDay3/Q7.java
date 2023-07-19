package HomeworkDay3;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int d=0;
		int s=0;
		
		
		while(n!=0) {
			d=n%10;
			s=s*10+d;
			n=n/10;
		}
	
		while(s!=0) {
			d=s%10;
			s=s/10;
		
		switch(d) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 0:
			System.out.println("Zero");
			break;
			
		}}
	
		
		}

	}


