package leetcode;
/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。

 *给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 * @author huangzhebin
 *
 */
public class StrStr {


	
	/**
	 * 解法一
	 * @param haystack
	 * @param needle
	 * @return
	 */

	public static int strStr(String haystack, String needle) {

		if (needle == null || needle.length() == 0)
            return 0;
        
        for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int j = 1;
				for (; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) //防止haystack 越界
                        break;
					if (haystack.charAt(i + j) != needle.charAt(j))
						break;
				}
				if (j == needle.length())
					return i;
			}
		}
        return -1;
	}
	
	/**
	 * 解法二
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr2(String haystack, String needle) {

		 if (needle == null || needle.length() == 0)
	            return 0;
	        if (needle.length() > haystack.length())
	        	return -1;
	        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			  if (haystack.substring(i, i + needle.length()).equals(needle))
				  return i;
			}
	        return -1;
	}

}
