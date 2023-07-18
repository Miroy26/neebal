package Homework2;
import java.util.Scanner;
public class UpperAndLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter upper limit");
		int up=sc.nextInt();
		System.out.println("Enter lower limit");
		int low =sc.nextInt();
		int s=1;
		int f=0;
		int t=0;
		for(int i=1; i<=200;i++) {
			t=s+f;
			if(t>=low && t<=up) {
				System.out.println(t);
			}
			if(t>up) {
				break;
			}
			f=s;
			s=t;
		}
		
		

	}

}
