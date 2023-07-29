package HomeworkDay11;

public class CamelCase {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(camelCase("miroyParmar"));

    }

    public static int camelCase(String n) {
	if (n.length() == 1) {
	    return 1;
	} else {
	    if (Character.isUpperCase(n.charAt(n.length() - 1))) {
		return 1 + camelCase(n.substring(0, n.length() - 1));
	    }
	}
	return camelCase(n.substring(0, n.length() - 1));
    }
}