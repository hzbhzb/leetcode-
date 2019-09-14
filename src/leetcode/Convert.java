package leetcode;

import java.util.ArrayList;

/**
 * 6. Z 字形变换 
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * @author huangzhebin
 *
 */
public class Convert {

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		boolean down = false;
		for (int i = 0; i < Math.min(s.length(), numRows); i++) {
			list.add(new StringBuilder());
		}
		int curRow = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((curRow == 0) || (curRow == numRows - 1))
				down = !down;
			list.get(curRow).append(s.charAt(i));
			curRow = down ? curRow + 1 : curRow - 1;
		}
		StringBuilder result = new StringBuilder();
		for (StringBuilder sb : list) {
			result.append(sb.toString());
		}
		return result.toString();
	}
}
