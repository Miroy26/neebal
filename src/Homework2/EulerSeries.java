package Homework2;
import java.util.Scanner;
public class EulerSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		 double s=0;
		 double num=x;
	     double f=1;
	     for(int i=1; i<=10; i++) {
	    	 f=f*i;
	    	 s=s+num/f;
	    	 num=num*x;
	     }
	     System.out.println(Math.exp(x));

	}

}
