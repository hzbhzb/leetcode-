package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 46. 全排列 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * 
 * @author huangzhebin
 *
 */
public class Permute {
	List<List<Integer>> alist = new ArrayList();

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ls = new ArrayList();
		List<Integer> l = new ArrayList();
		ls.add(l);

		addNums(0, nums, ls);

		return alist;
	}

	private void addNums(int index, int[] nums, List<List<Integer>> ls) {
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
			alist.addAll(ls2);
		else
			addNums(index + 1, nums, ls2);
	}

	// 解法二
	private void getUnique(int index, List<Integer> list, Set<Integer> added, int[] nums) {

		if (index == nums.length - 1) {
			alist.add(new ArrayList(list));
		} else {
			for (int j = 0; j < nums.length; j++) {
				if (added.add(j)) {
					list.add(nums[j]);
					getUnique(index + 1, list, added, nums);
					added.remove(j);

					list.remove(list.size() - 1);
				}

			}
		}

	}

}
