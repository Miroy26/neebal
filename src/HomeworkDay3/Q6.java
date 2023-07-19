package HomeworkDay3;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int start=sc.nextInt();
int n1=0;
int n2=1;
int f=0;
int c=0;
for(int i=1;;i++) {
	f= n1+n2;
	if(f>=start) {
		System.out.println(f);
		c++;
	}
	if(c==n) {
		break;
	}
	n1=n2;
	n2=f;
}




	}

}
