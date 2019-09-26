package leetcode;

/**
 * 48. 旋转图像 
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 
 * 将图像顺时针旋转 90 度。
 * 
 * 说明：
 * 
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * 
 * @author huangzhebin
 *
 */
public class Rotate {

	//从外圈开始旋转90度，第n圈就从n行开始遍历
	public void rotate(int[][] matrix) {

		int round = matrix.length - 2;
		int n = matrix.length;
		for (int i = 0; i <= round; i++) {
			for (int j = i; j <= n - 2 - i; j++) {
				int a = matrix[i][j];
				int b = matrix[j][n - i - 1];
				int c = matrix[n - i - 1][n - j - 1];
				int d = matrix[n - j - 1][i];
				matrix[i][j] = b;
				matrix[j][n - i - 1] = c;
				matrix[n - i - 1][n - j - 1] = d;
				matrix[n - j - 1][i] = a;
			}
		}

	}

}
