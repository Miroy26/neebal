package Homework;
import java.util.Scanner;
public class largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is the greatest");
			}

		}
		else if(b>c) {
			System.out.println("b is the greatest");
			
		}
		else
		{
			System.out.println("c is the greatest");
		}
		

	}

}
