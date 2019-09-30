package leetcode;

/**
 * 58. 最后一个单词的长度 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * @author huangzhebin
 *
 */
public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		int size = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				for (int j = i; j >= 0; j--) {
					if (s.charAt(j) != ' ')
						size += 1;
					else
						break;
				}
				break;
			}
		}
		return size;

	}

}
