package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *candidates 中的数字可以无限制重复被选取。
 * @author huangzhebin
 *
 */
public class CombinationSum {

    List<List<Integer>> list = new ArrayList();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
				sum += al.get(i).get(j);
			}
			if (sum == target) {
                
				list.add(al.get(i));
			} else {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] > target)
						break;
					if (sum + nums[j] <= target) {
						List<Integer> l = new ArrayList();
						l.addAll(al.get(i));
					
						l.add(nums[j]);
						
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
