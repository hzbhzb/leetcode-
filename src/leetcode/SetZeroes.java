package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 73. 矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * @author huangzhebin
 *
 */
public class SetZeroes {

	public void setZeroes(int[][] matrix) {
		
		List<Integer> rl = new ArrayList();
		List<Integer> cl = new ArrayList();
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rl.add(i);
					cl.add(j);
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if (rl.contains(i) || cl.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}

	}
	
	

}
