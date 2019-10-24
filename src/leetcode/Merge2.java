package leetcode;

/**
 * 88. 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * @author huangzhebin
 *
 */
public class Merge2 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int size = m + n;
		int i1 = m - 1;
		int i2 = n -1;
		int[] num = new int[m];
		for (int i = 0; i < m; i++) {
			num[i] = nums1[i];
		}
		
		for (int i = size - 1; i >= 0; i--) {
			if (i1 < 0) {
				nums1[i] = nums2[i2];
				i2 -= 1;
			} else if (i2 < 0) {
				nums1[i] = num[i1];
				i1 -= 1;
			} else if (i1 >= 0 && num[i1] > nums2[i2]) {
				nums1[i] = num[i1];
				
				i1 -= 1;
			} else {
				nums1[i] = nums2[i2];
				
				i2 -= 1;
			}
		}

	}

}
