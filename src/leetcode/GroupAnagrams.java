package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 49. 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * @author huangzhebin
 *
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> list = new ArrayList();

		int [] tags = new int[strs.length];
		for(int i = 0; i < strs.length; i++) {
			if (tags[i] != 0) {
				String s = strs[i];
				tags[i] = 1;
				List<String> l = new ArrayList();
				l.add(s);
				for(int j = i+1; j < strs.length; j++) {
					if (tags[j] != 0) {
						if (isAnagram(s, strs[j])) {
							tags[j] = 1;
							
							l.add(strs[j]);
						}
					}
				}
				list.add(l);
			}
		}
		
		return list;

	}
	
	public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] nums = new int[128];
        for(int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)] += 1;
            nums[t.charAt(i)] -= 1;
        }
        for(int i = 0; i < 128; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
