package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *candidates 中的每个数字在每个组合中只能使用一次。
 *说明：
 *所有数字（包括目标数）都是正整数。
 *解集不能包含重复的组合。
 * @author huangzhebin
 *
 */
public class CombinationSum2 {
	
    List<List<Integer>> list = new ArrayList();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> al = new ArrayList();
       List<Integer> l = new ArrayList();
       
       al.add(l);
       
       Arrays.sort(candidates);
       getSum(0, candidates, al, target);
       return list;
	}
	
	private void getSum(int index, int []nums, List<List<Integer>> al, int target) {
		
		List<List<Integer>> ls = new ArrayList();
		for (int i = 0; i < al.size(); i++) {
			int sum = 0;
			for (int j = 0; j < al.get(i).size(); j++) {
				sum += nums[al.get(i).get(j)];
			}
			if (sum == target) {
				List<Integer> l = new ArrayList();
                for (Integer position : al.get(i))
				l.add(nums[position]);
                list.add(l);
			} else {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] > target)
						break;
					if (al.get(i).contains(j))
						continue;
					if (sum + nums[j] <= target) {
						List<Integer> l = new ArrayList();
						l.addAll(al.get(i));
					
						l.add(j);
						
						Collections.sort(l);
						
						if (!ls.contains(l))
						ls.add(l);
					}
				}
				
			}
		}
		if (ls.size() > 0)
			getSum(index + 1, nums, ls, target);
	}

}
