package HomeworkDay11;

public class SumOfElementsInList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	System.out.println(arrAdd(arr, 0));

    }

    public static int arrAdd(int arr[], int n) {
	if (n == arr.length - 1) {
	    return arr[n];
	} else {
	    return arr[n] + arrAdd(arr, n + 1);
	}
    }

}
