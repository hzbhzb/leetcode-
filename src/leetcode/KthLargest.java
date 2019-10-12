package leetcode;

/**
 * 703. 数据流中的第K大元素 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 * 
 * 你的 KthLargest 类需要一个同时接收整数 k
 * 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 * 
 * @author huangzhebin
 *
 */
public class KthLargest {

	int[] knums;

	public KthLargest(int k, int[] nums) {

		knums = new int[k];
		for (int i = 0; i < k; i++) {
			knums[i] = Integer.MIN_VALUE;
		}
		buildHeap(knums);
		for (int i = 0; i < nums.length; i++) {
			add(nums[i]);
		}
	}

	public int add(int val) {
		if (knums[0] < val) {
			knums[0] = val;
			heapify(knums, knums.length, 0);
		}
		return knums[0];
	}

	private void buildHeap(int[] nums) {
		for (int i = nums.length / 2 - 1; i >= 0; --i) {
			heapify(nums, nums.length, i);
		}
	}

	private void heapify(int[] nums, int n, int i) {

		while (true) {
			int minPos = i;
			if (2 * i + 1 < n && nums[2 * i + 1] < nums[minPos])
				minPos = 2 * i + 1;

			if (2 * i + 2 < n && nums[2 * i + 2] < nums[minPos])
				minPos = 2 * i + 2;

			if (minPos == i)
				break;

			int x = nums[i];
			nums[i] = nums[minPos];
			nums[minPos] = x;
			i = minPos;
		}
	}

}
