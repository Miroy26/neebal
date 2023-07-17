package com.gurukul.day1;
import java.util.Scanner;

public class Minimumcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an amount");
		Scanner sc=new Scanner(System.in);
		int amt= sc.nextInt();
    	 int twoth=amt/2000;
    	 amt=amt%2000;
    	 int fivehund=amt/500;
    	 amt=amt%500;
    	 int twohund=amt/200;
    	 amt=amt%200;
    	 int onehund=amt/100;
    	  amt=amt%100;
    	 int fifty=amt/50;
    	  amt=amt%50;
    	 int twenty=amt/20;
    	  amt=amt%20;
    	 int five=amt/5;
    	 System.out.println(twoth+"x2000="+(twoth*2000));
    	 System.out.println(fivehund+"x500="+(fivehund*500));
    	 System.out.println(twohund+"x200="+(twohund*200));
    	 System.out.println(onehund+"x100="+(onehund*100));
    	 System.out.println(fifty+"x50="+(fifty*50));
    	 System.out.println(twenty+"x20="+(twenty*20));
    	 System.out.println(five+"x5="+(five*5));
    	 


	 

	}

}
