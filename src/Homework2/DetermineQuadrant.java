package Homework2;
import java.util.Scanner;
public class DetermineQuadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x coordinates");
		int x=sc.nextInt();
		System.out.print("Enter y coordinates");
		int y=sc.nextInt();
		if(x>0 && y>0) {
			System.out.println("1st Quadrant");
		}
		else if(x==0 && y>0 || y<0) {
			System.out.println("Y axis");
		}
		else if(x<0||x>0 && y==0) {
			System.out.println("X axis");
		}
		else if(x<0 && y>0) {
			System.out.println("2nd Quadrant");
		}
		else if(x<0 && y<0) {
			System.out.println("3rd Quadrant");
		}
		else if(x==0 && y==0) {
			System.out.println("Origin");
		}
		else {
			System.out.println("4th Quadrant");
		}

	}

}
