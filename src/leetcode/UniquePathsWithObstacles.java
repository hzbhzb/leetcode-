package leetcode;

/**
 * 63. 不同路径 II 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 
 * @author huangzhebin
 *
 */
public class UniquePathsWithObstacles {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		int[][] path = new int[m][n];
		for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0] == 1)
				break;
			path[i][0] = 1;
		}

		for (int j = 0; j < n; j++) {
			if (obstacleGrid[0][j] == 1)
				break;
			path[0][j] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 0) {
					path[i][j] = path[i - 1][j] + path[i][j - 1];
				}
			}
		}
		return path[m - 1][n - 1];

	}

}
