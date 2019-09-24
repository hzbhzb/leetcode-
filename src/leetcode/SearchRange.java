package leetcode;

public class SearchRange {

	public int[] searchRange(int[] nums, int target) {
         int left = 0, right = nums.length;
         while (left < right) {
        	 int mid = (left + right) / 2;
        	 if (nums[mid] == target) {
        		 
        	 } else if (nums[mid] > target) {
        		 right = mid;
        	 } else {
        		 left = mid + 1;
        	 }
         }
         return new int[] {-1, -1};
	}

}
