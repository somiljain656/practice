package somil.practice.DP;

public class LCM {
	
	public static void main(String[] args) {
		String s1 = "somiljain", s2 = "somlijain";
		System.out.println(compute(s1, s2));
	}

	private static int compute(String s1, String s2) {
		
		int[][] lcm = new int[s1.length()+1][s2.length()+1];
		
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0) {
					lcm[i][j] = 0;
				} else if (s1.charAt(i-1) == s2.charAt(j-1)) {
					lcm[i][j] = lcm[i-1][j-1] + 1;
				} else {
					lcm[i][j] = Math.max(lcm[i-1][j], lcm[i][j-1]);
				}
			}
		}
		
		return lcm[s1.length()][s2.length()];
	}

}
