package leetcode;

/**
 * 31. 下一个排列
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *必须原地修改，只允许使用额外常数空间。
 * @author huangzhebin
 *
 */
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void nextPermutation(int[] nums) {
		boolean swag = false;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {

				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] <= nums[i - 1]) {
						int x = nums[j - 1];
						nums[j - 1] = nums[i - 1];
						nums[i - 1] = x;
						swag = true;
						break;
					}
				}

				if (!swag) {
					int x = nums[i - 1];
					nums[i - 1] = nums[nums.length - 1];
					nums[nums.length - 1] = x;
					swag = true;
				}
				for (int j = i; j < (nums.length + i) / 2; j++) {

					int x = nums[j];
					nums[j] = nums[nums.length - 1 - j + i];
					nums[nums.length - 1 - j + i] = x;
				}
				break;
			}
		}
		if (!swag) {
			for (int i = 0; i < nums.length / 2; i++) {
				int x = nums[i];
				nums[i] = nums[nums.length - 1 - i];
				nums[nums.length - 1 - i] = x;
			}
		}
	}
}
