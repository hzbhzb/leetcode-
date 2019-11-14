package leetcode;

import java.util.Arrays;

/**
 * 268. 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * @author huangzhebin
 *
 */
public class MissingNumber {

	public int missingNumber(int[] nums) {
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i])
				return i;
		}
		return nums.length;

	}

}
