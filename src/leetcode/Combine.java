package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * @author huangzhebin
 *
 */
public class Combine {

	List<List<Integer>> list = new ArrayList();
	public List<List<Integer>> combine(int n, int k) {
		
		
		for (int j = 1; j <= n - k + 1; j++) {
			List<Integer> nl = new ArrayList();

			nl.add(j);
			getNum(1, j+1, n, k, nl);
		}
		return list;
	}
	
	private void getNum(int level, int i, int n, int k, List<Integer> l) {
		
		if (level == k) {
			list.add(l);
		} else {
			for (int j = i; j <= n; j++) {
				List<Integer> nl = new ArrayList();
				nl.addAll(l);
				nl.add(j);
				getNum(level + 1, j+1, n, k, nl);
			}
		}
		
	}

}
