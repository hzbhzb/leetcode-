package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	List<String> list = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		insertParenthesis("", n);
		return list;
	}
	
	private void insertParenthesis(String result, int n) {
		if (n > 0) {
			insertParenthesis("(" + result + ")",  n-1);
			for (int i = 0; i < result.length(); i++) {
				insertParenthesis(result.substring(0, i) + "()" + result.substring(i), n-1);
			}
		} else {
			if (!list.contains(result))
			   list.add(result);
		}
	}
}
