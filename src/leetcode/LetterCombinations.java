package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

 *给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author huangzhebin
 *
 */
public class LetterCombinations {
	
	List<String> list= new ArrayList<String>();
	HashMap<Character, String> map = new HashMap<Character, String>();
    
    public List<String> letterCombinations(String digits) {

		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		getOutputs("", digits);
		
		
		return list;
	}
	
	private void getOutputs(String s, String inputNum) {
		
		if (inputNum.length() > 0) {
			String letters = map.get(inputNum.charAt(0));
			for (int i = 0; i < letters.length(); i++) {
				String result = s + letters.charAt(i);
			
				getOutputs(result, inputNum.substring(1));
			}
			
		} else {
			//输入结束时添加到列表中
            if (s.length() > 0)
            list.add(s);
        }
		
	}
}
