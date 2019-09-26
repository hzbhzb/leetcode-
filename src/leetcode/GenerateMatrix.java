package leetcode;

/**
 * 59. 螺旋矩阵 II
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * @author huangzhebin
 *
 */
public class GenerateMatrix {

	public int[][] generateMatrix(int n) {

		int round = n - 2;
		int x = 1;
		int[][] ret = new int[n][n];
		for (int i = 0; i <= round; i++) {
			for (int j = i; j <= n - 2 - i; j++) {
				ret[i][j] = x;
				ret[j][n - i - 1] = x + (n-1 - 2*i);
				ret[n - i - 1][n - j - 1] = x + 2*(n-1 - 2*i);
				ret[n - j - 1][i] = x + 3*(n-1 - 2*i);
                x += 1;
			}
            x = x + 3*(n-1 - 2*i);
		}
        if (n % 2 != 0)
            ret[n/2][n/2] = n*n;
		return ret;

	}

}
