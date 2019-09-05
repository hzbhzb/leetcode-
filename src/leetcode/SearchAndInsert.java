package leetcode;

/**
 * 35. 搜索插入位置
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

 * @author huangzhebin
 *
 */
public class SearchAndInsert {

	/**
	 * 遍历解法，时间复杂度为O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public  int searchAndInsert(int[] nums, int target) {
		
		
		if ((nums.length == 1 && target <= nums[0]) || nums.length == 0)
			return 0;
			
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] >= target)
				return i;
			else if (nums[i] < target && nums[i + 1] >= target)
				return i+1;
		}
		return nums.length;
	}
	
	/**
	 * 二分法解法，时间复杂度为O(logn)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchAndInsert2(int[] nums, int target) {

		if ((nums.length == 1 && target <= nums[0]) || nums.length == 0)
			return 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] >= target)
				return i;
			else if (nums[i] < target && nums[i + 1] >= target)
				return i + 1;
		}
		return nums.length;
	}
}
