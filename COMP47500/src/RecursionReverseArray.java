
/**
 * @author Hira Naseem
 * Example of Reversing an Array using Recursion 
 *
 */
import java.util.Arrays;

public class RecursionReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		//System.out.print(Arrays.toString(ReverseArray(arr, 0, 4)));
		ReverseArray(arr, 0, 4);
		for(int i : arr) {
			System.out.print(i + "");
		}
	}
	
	public static int[] ReverseArray(int[] x, int startOfArray, int endOfArray) {
		if(startOfArray<endOfArray){//Swap
		       int tmp = x[startOfArray];
		       x[startOfArray] = x[endOfArray];
		       x[endOfArray] = tmp;
	           ReverseArray(x, startOfArray+1, endOfArray-1);
		}
		return x;
	}

}
