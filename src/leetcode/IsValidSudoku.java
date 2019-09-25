package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 
 * 数字 1-9 在每一行只能出现一次。 数字 1-9 在每一列只能出现一次。 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 
 * 
 * 上图是一个部分填充的有效的数独。
 * 
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * 
 * @author huangzhebin
 *
 */
public class IsValidSudoku {

	public boolean isValidSudoku(char[][] board) {

		HashMap<Integer, Set<Character>> map1 = new HashMap<Integer, Set<Character>>();
		HashMap<Integer, Set<Character>> map2 = new HashMap<Integer, Set<Character>>();
		HashMap<Integer, Set<Character>> map3 = new HashMap<Integer, Set<Character>>();

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (map1.get(i) != null) {
						if (!map1.get(i).add(board[i][j]))
							return false;
						;
					} else {
						Set<Character> set = new HashSet();
						set.add(board[i][j]);
						map1.put(i, set);
					}
					if (map2.get(j) != null) {
						if (!map2.get(j).add(board[i][j]))
							return false;
						;
					} else {
						Set<Character> set = new HashSet();
						set.add(board[i][j]);
						map2.put(j, set);
					}
					int index = i / 3 + (j / 3) * 3;
					if (map3.get(index) != null) {
						if (!map3.get(index).add(board[i][j]))
							return false;
						;
					} else {
						Set<Character> set = new HashSet();
						set.add(board[i][j]);
						map3.put(index, set);
					}
				}

			}
		}
		return true;
	}

}
