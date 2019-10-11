package leetcode;

/**
 * 215. 数组中的第K个最大元素 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k
 * 个不同的元素。
 * 
 * @author huangzhebin
 *
 */

public class FindKthLargest {

	public int findKthLargest(int[] nums, int k) {
		int n = nums.length;
		buildHeap(nums);
		while (k >= 1) {
			nums[0] = nums[n - 1];
			heapify(nums, n, 0);
			n -= 1;
			k -= 1;
		}
		return nums[0];

	}

	private void buildHeap(int[] nums) {
		for (int i = nums.length / 2 - 1; i >= 0; --i) {
			heapify(nums, nums.length, i);
		}
	}

	private void heapify(int[] nums, int n, int i) {

		while (true) {
			int maxPos = i;
			if (2 * i + 1 < n && nums[2 * i + 1] > nums[maxPos])
				maxPos = 2 * i + 1;

			if (2 * i + 2 < n && nums[2 * i + 2] > nums[maxPos])
				maxPos = 2 * i + 2;

			if (maxPos == i)
				break;

			int x = nums[i];
			nums[i] = nums[maxPos];
			nums[maxPos] = x;
			i = maxPos;
		}
	}

}
