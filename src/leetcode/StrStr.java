package leetcode;

public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        strStr("hello", "ll");
	}

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

}
