package Homework2;

import java.util.Scanner;
public class CosineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		double x=sc.nextDouble();
		x=Math.toRadians(x);

				  double s=0;
				     double num=x;
				     double f=1;
				     for(int i=1; i<20; i++) {
				    	 
				    	 f=f*i;
				    	 if(i%2==0) {
				    		 s=s+num/f;
				    		 num=-num*x*x;
				    	 }
				    	 
			          }
				     System.out.println(""+s);
				     System.out.println(Math.cos(x));

	}

}
