package Homework2;
import java.util.Scanner;
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=0;
		int count=0;
		
		int f=0;
		int s=1;
		for(int i=1; i<=100; i++) {
			 t=f+s;
			if(t%2==0) {
			System.out.println(t);
			count++;
			 }
			if(count==10) {
				break;
			}
			f=s;
			s=t;
			}
		}

	}


