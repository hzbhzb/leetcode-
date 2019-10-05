package leetcode;

/**
 * 66. 加一 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * @author huangzhebin
 *
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {

		int x = 0;
		int i;
		for (i = digits.length - 1; i >= 0; i--) {
			x = digits[i] + 1;
			if (x >= 10) {
				digits[i] = x - 10;
				if (i == 0) {
					int[] ret = new int[digits.length + 1];
					ret[0] = 1;
					for (int j = 1; j < ret.length; j++)
						ret[j] = digits[j - 1];
					return ret;
				}
			} else {
				digits[i] = x;
				break;
			}

		}
		return digits;

	}

}
