package somil.practice.DP;

public class EditDistance {
	
	public static void main(String[] args) {
		String s1 = "somiljain", s2 = "somlijain";
		System.out.println(compute(s1, s2));
	}

	private static int compute(String s1, String s2) {
		
		int[][] cs = new int[s1.length()+1][s2.length()+1];
		
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++ ) {
				if (i == 0) {
					cs[i][j] = j;
				} else if ( j == 0) {
					cs[i][j] = i;
				} else if (s1.charAt(i-1) == s2.charAt(j-1)) {
					cs[i][j] = cs[i-1][j-1];
				} else {
					cs[i][j] = 1 + min(cs[i-1][j-1], cs[i-1][j], cs[i][j-1]);
				}
			}
		}
		
		return cs[s1.length()][s2.length()];
	}
	
	static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    } 
}
