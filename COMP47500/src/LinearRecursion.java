
/**
 * @author Hira Naseem
 * Example of Linear Recursion 
 *
 */
public class LinearRecursion {

	public static void main(String[] args) {
		int array[] = new int[]{4, 3, 6, 2, 5};
		
		System.out.print(ArrayRecursion(array, array.length));
	}
	
	public static int ArrayRecursion(int[] arr, int size) {
		if(size == 1) {//base case
			return arr[0];
		}
		else {
			return ArrayRecursion(arr, size - 1) + arr[size-1];
		}
	}

}
