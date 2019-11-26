package leetcode;

import java.util.HashMap;
/**
 * 
 * 137. 只出现一次的数字 II
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 * @author huangzhebin
 *
 */
public class SingleNumber2 {

	// 解法一
	public int singleNumber(int[] nums) {
		
		HashMap<Integer, Integer> hashMap =  new HashMap();
		for (int num : nums) {
			if (hashMap.containsKey(num)) {
				hashMap.put(num, hashMap.get(num) + 1);
			} else {
				hashMap.put(num, 1);
			}
		}
		
		for (Integer key : hashMap.keySet()) {
			if (hashMap.get(key) == 1) 
				return key;
		}
		
		return -1;
	    
	}

}
