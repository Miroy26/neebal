package Homework;
import java.util.Scanner;
public class MilitaryCommunication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
				System.out.println("Enter a 4 digit number");
		int a=sc.nextInt();
        int minute;
        minute=a%100;
        a=a/100;
        if(a>12) {
        	a=a-12;
        	System.out.println(a+":"+minute+"pm");
        }
        else {
        	System.out.println(a+":"+minute+"am");
        }
     }
        
        
	


}
