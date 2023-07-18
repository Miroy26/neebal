package Homework2;
import java.util.Scanner;
public class Additionofpolarcoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter r1");
		int r1=sc.nextInt();
		System.out.println("Enter r2");
		int r2=sc.nextInt();
		System.out.println("Enter th1");
		int th1=sc.nextInt();
		System.out.println("Enter th2");
		int th2=sc.nextInt();
        double degree1=Math.toRadians(th1);
        double degree2=Math.toRadians(th2);
        double x1=r1*Math.cos(degree1);
        double y1=r1*Math.sin(degree1);
        double x2=r2*Math.cos(degree2);
        double y2=r2*Math.sin(degree2);
        double x3=x1+x2;
        double y3=y1+y2;
        double r3=Math.sqrt(Math.pow(x3,2)+Math.pow(y3,2));
        double th3=Math.atan(y3/x3);
        double degree3=Math.toDegrees(th3);
        System.out.println(""+r3);
        System.out.println(""+degree3);
		

	}

}
