package somil.practice.questions;

public class Kadane {
	
	public static void main(String[] args) {
		
		int[] arr = {10,2,5, -5, 10};
		System.out.println(compute(arr));
	}

	private static int compute(int[] arr) {
		
		int max = Integer.MIN_VALUE, maxTillHere = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			
			maxTillHere = maxTillHere + arr[i];
			
			if (maxTillHere < 0) {
				maxTillHere = 0;
			}
			
			if (maxTillHere >= max) {
				max = maxTillHere;
			}
			
		}
		
		return max;
	}

}
