package somil.practice.DP;

public class MinimumPathSum {
	
	public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		minPathSum(arr);
	}
	
	private static void minPathSum(int[][] grid) {
	
		if (grid == null || grid.length == 0) {
			System.out.println(0);
			return;
		}
		
		int[][] dp = new int[grid.length][grid[0].length];
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j< dp[i].length; j++) {
				dp[i][j] = grid[i][j];
				if (i > 0 && j > 0) {
					dp[i][j] += Math.min(dp[i-1][j], dp[i][j-1]);
				} else if (i > 0) {
					dp[i][j] += dp[i-1][j];
				} else if ( j > 0 ) {
					dp[i][j] += dp[i][j-1];
				}
			}
		}
		
		System.out.println(dp[grid.length-1][grid[0].length - 1]);
    }
	
}
