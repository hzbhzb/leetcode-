package leetcode;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 *例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

 *与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).

 * @author huangzhebin
 *
 */
public class ThreeSumClosest {

	
	
    public int threeSumClosest(int[] nums, int target) {
        
    	
    	Arrays.sort(nums);
    	int result =  Integer.MAX_VALUE, num = 0;
    	for (int i = 0; i < nums.length - 2; i++) {
    		int left = i + 1, right = nums.length - 1;
    		while (left < right) {
    			int sum = nums[i] + nums[left] + nums[right];
    			if (sum > target)
    				right -= 1;
    			else if (sum == target)
    				return sum;
    			else 
    				left += 1;
                if (Math.abs(target - sum) == result) {
                    if (sum > result) {
                         num = sum;
        
                    }
                       
                } else if (Math.abs(target - sum) < result) {
                    num = sum;
                    result = Math.abs(target - sum);
                }
    				
    		}
    	}
    	 return num;
    	
    	
    }

}
