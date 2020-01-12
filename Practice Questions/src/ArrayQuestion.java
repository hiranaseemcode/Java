
public class ArrayQuestion {

	public static void main(String[] args) {
		
		//create an array containing numbers from 10 to 20
		int[] array = new int[] {11,12,13,14,15,16,17,18,19,20};
		int[] newArray = new int[array.length];
		int sum = 0;
		
		//Calculate and print the sum of the array
		for(int i : array){
			sum = sum + i;
		}
		System.out.println("sum is: "+sum);
		
		//Replace each value in the original array with the current value multiplied by 3. Print the new contents. 
		for(int j = 0; j< newArray.length; j++) {
			newArray[j] = array[j] * 3; 
		}
		
		for(int k : newArray) {
			System.out.print(k + " ");
		}
	}

}
