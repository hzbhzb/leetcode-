package leetcode;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

 * @author huangzhebin
 *
 */
public class IsValid {

	public boolean isValid(String s) {

		int n = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isLeft(c)) {
				sb.append(c);
			} else {
				if (sb.length() == 0)
                    return false;
				switch(c) {
				case '}':
					if (sb.charAt(sb.length() - 1) != '{')
						return false;
						
					break;
				case ']':
					if (sb.charAt(sb.length() - 1) != '[')
						return false;

					break;
				case ')':
					if (sb.charAt(sb.length() - 1) != '(')
						return false;
					break;
				}
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		return sb.length() == 0;
	}
	
	private boolean isLeft(char c) {
		return c == '{' || c == '(' || c == '[';
	}
}
