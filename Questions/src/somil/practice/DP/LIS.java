package somil.practice.DP;

public class LIS {

	public static void main(String[] args) {
		
		int[] arr = {10,12,15,20,22,30,31,-10};
		System.out.println(compute(arr));
	}

	private static int compute(int[] arr) {

		int[] lis = new int[arr.length];

		for (int i = 0; i < lis.length; i++) {
			lis[i] = 1;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++ ) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < lis.length; i++) {
			if ( lis[i] > max) {
				max = lis[i];
			}
		}
		
		return max;
	}

}
