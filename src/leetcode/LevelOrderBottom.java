package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderBottom {
	
	/**
	 * Definition for singly-linked list.
	 */
	public class TreeNode {
		int val;
        TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	List<List<Integer>> ret;
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ret = new ArrayList();
        
        return ret;
	}
	
	private int addLeaf(TreeNode node) {
		List<Integer> l = new ArrayList();
		
		return 0;
	}

}
