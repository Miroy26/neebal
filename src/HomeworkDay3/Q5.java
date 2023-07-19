package HomeworkDay3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x3=1;x3<=10000;x3++) {
		int digit=0;
		int count=0;
		int x2=x3;
		int x=x3;
		while(x!=0) {
			digit=x%10;
			count++;
			x=x/10;
			}
		int sum=0;
		while(x2!=0) {
			digit=x2%10;
			sum=(int)(sum+Math.pow(digit, count));
			x2=x2/10;
			
		}
		
		if(sum==x3) {
			System.out.println(x3);
		}

		}
	}
	}
