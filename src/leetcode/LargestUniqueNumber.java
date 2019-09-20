package leetcode;

public class LargestUniqueNumber {
	
	
    //解法一，空间换时间
	public int largestUniqueNumber(int[] A) {
		
		int [] nums = new int[1001];
        for (int i = 0; i < A.length; i++) {
            nums[A[i]] += 1;
        }
        for (int i = 1000; i > 0; i--)
            if (nums[i] == 1)
                return i;
        return -1;

	}

}
