package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * ？找出所有满足条件且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 
 * 满足要求的三元组集合为： [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 * @author huangzhebin
 *
 */

public class ThreeSum {

	
	public  List<List<Integer>> threeSum(int[] nums) {

		// 先排序得到一个从小排列的数组
		List<List<Integer>> allList = new ArrayList<>();
		for (int i = 0; i < nums.length; ++i) {
			boolean swag = false;
			for (int j = 0; j < nums.length - i - 1; ++j) {
				if (nums[j] > nums[j + 1]) {
					int x = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = x;
					swag = true;
				}
			}
			if (!swag)
				break;
		}

		for (int i = 0; i < nums.length - 2;) {

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					List<Integer> list = new ArrayList();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);

					allList.add(list);
					while (left < right && nums[left] == nums[++left])
						;
					while (left <= right && nums[right] == nums[--right])
						;
				} else if (sum > 0) {
					while (left <= right && nums[right] == nums[--right])
						;
				} else {
					while (left < right && nums[left] == nums[++left])
						;
				}
			}
			while (i < nums.length - 1 && nums[i] == nums[++i])
				;
		}
		return allList;
	}

}
