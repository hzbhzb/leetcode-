package leetcode;

import java.util.Arrays;

/**
 * 1122. 数组的相对排序 给你两个数组，arr1 和 arr2， arr2 中的元素各不相同 arr2 中的每个元素都出现在 arr1 中 对
 * arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾
 * 
 * @author huangzhebin
 *
 */
public class RelativeSortArray {

	// 解法一
	public int[] relativeSortArray(int[] arr1, int[] arr2) {

		int[] nums = new int[arr1.length];

		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					nums[index++] = arr1[j];
					arr1[j] = -1;
				}
			}
		}
		Arrays.sort(arr1);
		for (int i = index; index < nums.length; index++) {
			nums[index] = arr1[index];
		}
		return nums;
	}

	// 解法二
	public int[] relativeSortArray2(int[] arr1, int[] arr2) {

		int[] nums = new int[arr1.length];
		int[] arr = new int[1001];

		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr[arr1[i]] += 1;
		}

		for (int i = 0; i < arr2.length; i++) {
			while (arr[arr2[i]] > 0) {
				nums[index++] = arr2[i];
				arr[arr2[i]] -= 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				nums[index++] = i;
				arr[i] -= 1;
			}
		}

		return nums;
	}

}
