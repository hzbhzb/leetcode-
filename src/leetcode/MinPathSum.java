package leetcode;

public class MinPathSum {

	public int minPathSum(int[][] grid) {
		int[][] state = new int[grid.length][grid[0].length];
		state[0][0] = grid[0][0];
		for (int i = 1; i < grid[0].length; i++) {
			state[0][i] = grid[0][i] + state[0][i-1];
		}
		
		for (int j = 1; j < grid.length; j++) {
			state[j][0] = grid[j][0] + state[j-1][0];
		}
		for (int i = 1; i < grid.length; ++i) {
			for (int j = 1; j < grid[0].length; ++j) {
				state[i][j] = grid[i][j] + Math.min(state[i-1][j], state[i][j-1]);
			}
		}
        return state[grid.length-1][grid[0].length-1];//getPathSum(grid.length-1, grid[grid.length-1].length - 1, grid);
	}
	
	//递归解法
	
	private int getPathSum(int i, int j, int [][]grid) {
		
		if (i == 0 && j == 0) {
			return grid[0][0];
		}
		
		int left = Integer.MAX_VALUE;
		if (j-1>=0) {
			left = getPathSum(i, j-1, grid);
		}
		int up = Integer.MAX_VALUE;
		if (i-1>=0) {
			up = getPathSum(i-1, j, grid);
		}
		
		return grid[i][j] + Math.min(left, up);
	}

}
