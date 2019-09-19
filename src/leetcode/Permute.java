package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * @author huangzhebin
 *
 */
public class Permute {
	List<List<Integer>> list = new ArrayList();
	 
	public  List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ls = new ArrayList();
        List<Integer> l = new ArrayList();
		ls.add(l);
        
		addNums(0, nums, ls);
        
		return list;
	}
	
	private  void addNums(int index, int[] nums, List<List<Integer>> ls) {
		List<List<Integer>> ls2 = new ArrayList();
		for (int i = 0; i < ls.size(); i++) {
			
			for (int j = 0; j < nums.length; j++) {
				if (!ls.get(i).contains(nums[j])) {
					List<Integer> l = new ArrayList();
					l.addAll(0, ls.get(i));
					l.add(nums[j]);
					ls2.add(l);
				}
			}
		}
		if (index == nums.length - 1)
			list.addAll(ls2);
		else
		    addNums(index + 1, nums, ls2);
	}

}
