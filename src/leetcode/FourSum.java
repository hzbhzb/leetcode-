package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  18. 四数之和
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * @author huangzhebin
 *
 */
public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		// 先排序得到一个从小排列的数组
		List<List<Integer>> allList = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3;) {

			for (int j = i + 1; j < nums.length - 2;) {

				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						List<Integer> list = new ArrayList();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[left]);
						list.add(nums[right]);

						allList.add(list);
						while (left < right && nums[left] == nums[++left])
							;
						while (left <= right && nums[right] == nums[--right])
							;
					} else if (sum > target) {
						while (left <= right && nums[right] == nums[--right])
							;
					} else {
						while (left < right && nums[left] == nums[++left])
							;
					}
				}
				while (j < nums.length - 2 && nums[j] == nums[++j])
					;
			}

			while (i < nums.length - 3 && nums[i] == nums[++i])
				;

		}
		return allList;
	}

}
