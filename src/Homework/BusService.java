package Homework;
import java.util.Scanner;
public class BusService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter X");
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int b=50*(X/50);
		System.out.println("Number of passengers are "+b);

	}

}
