package leetcode;

/**
 * 74. 搜索二维矩阵 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 
 * 每行中的整数从左到右按升序排列。 每行的第一个整数大于前一行的最后一个整数。
 * 
 * @author huangzhebin
 *
 */
public class SearchMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix.length == 0 || matrix[0].length == 0)
			return false;
		int low = 0, high = matrix.length - 1;
		int rmid = 0;
		while (low <= high) {
			rmid = (low + high) / 2;
			if (matrix[rmid][0] > target)
				high = rmid - 1;
			else if (matrix[rmid][0] <= target && matrix[rmid][matrix[rmid].length - 1] >= target)
				break;
			else
				low = rmid + 1;

		}

		int left = 0, right = matrix[rmid].length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (matrix[rmid][mid] > target)
				right = mid - 1;
			else if (matrix[rmid][mid] < target)
				left = mid + 1;
			else
				return true;
		}

		return false;

	}

}
