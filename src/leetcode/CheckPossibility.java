package leetcode;

public class CheckPossibility {

	public boolean checkPossibility(int[] nums) {
       
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j+1]) {
					int x = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = x;
					count += 1;
				}
			}
		}
		return count < 2;
	}

}
