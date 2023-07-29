package HomeworkDay11;

public class CountNumberOfDigits {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(count(234));

    }

    public static int count(int n) {
	if (n / 10 == 0) {
	    return 1;
	} else {
	    return 1 + count(n / 10);
	}
    }

}
