package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author huangzhebin
 *
 */
public class Permute {
	static List<List<Integer>> list = new ArrayList();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = new int[] {1};
        permute(nums);
	}
	
	public static  List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ls = new ArrayList();
        List<Integer> l = new ArrayList();
		ls.add(l);
        
		addNums(-1, nums, ls);
        
		return list;
	}
	
	private static  void addNums(int index, int[] nums, List<List<Integer>> ls) {
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
			list.addAll(ls);
		else
		    addNums(index + 1, nums, ls2);
	}

}
