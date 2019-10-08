package leetcode;

/**
 * 52. N皇后 II n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 
 * 
 * 
 * 上图为 8 皇后问题的一种解法。
 * 
 * 给定一个整数 n，返回 n 皇后不同的解决方案的数量。
 * 
 * @author huangzhebin
 *
 */
public class TotalNQueens {

	int[] result;

	int total;

	public int totalNQueens(int n) {

		callQueens(0, n);
		return total;
	}

	private void callQueens(int row, int n) {
		if (row == n)
			total += 1;
		for (int i = 0; i < n; i++) {
			if (isValid(row, i, n)) {
				result[row] = i;
				callQueens(row + 1, n);
			}
		}
	}

	private boolean isValid(int row, int column, int n) {
		int left = column - 1, right = column + 1;
		for (int i = row - 1; i >= 0; i--) {
			if (result[i] == column)
				return false;
			if (result[i] == left)
				return false;
			if (result[i] == right)
				return false;
			--left;
			++right;
		}
		return true;
	}
}
