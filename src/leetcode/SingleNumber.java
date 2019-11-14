package leetcode;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author huangzhebin
 *
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
	
		
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] ^ nums[i-1];
		}
		return nums[nums.length - 1];

	}

}
