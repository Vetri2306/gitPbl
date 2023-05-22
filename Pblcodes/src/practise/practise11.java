package practise;
import java.util.Arrays;

public class practise11 {

	public static void main(String[] args) {
		
		int[] array = {19, 14, 20, 2};
		
		System.out.println("Array: "+Arrays.toString(array));
		
		int max = array[0];
		
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > max)
				  max = array[i];
			
		}
		
		System.out.println("the maximum value of Array is: " +max);
		
		int min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min)
				
				min = array[i];
		}
		System.out.println("The minimum value of Array is: "+min);
		
		
		
	}
}
