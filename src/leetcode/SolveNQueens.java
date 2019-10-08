package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 51. N皇后
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * @author huangzhebin
 *
 */
public class SolveNQueens {
	
	int [] result;
	List<List<String>> list = new ArrayList();

	public List<List<String>> solveNQueens(int n) {
		
		result = new int[n];
		callQueens(0, n);
        return null;
	}
	
	private void callQueens(int row, int n) {
		
		if (row == n)//到达底部 
		{
			List<String> l = new ArrayList();
			for (int i = 0; i < n; i++) {
				StringBuilder s = new StringBuilder();
				for (int j = 0; j < n; j++) {
					if (j == result[i])
						s.append("Q");
					else
						s.append(".");
				}
				l.add(s.toString());
			}
			list.add(l);
			return;
		}
			
		for(int i = 0; i < n; i++) {
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
			if (left >= 0 && result[i] == left)
				return false;
			if (right < n && result[i] == right)
				return false;
            left = left - 1;
            right = right + 1;
				
		}
		return true;
	}

}
