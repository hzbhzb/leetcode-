package leetcode;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * 
 * @author huangzhebin
 *
 */
public class RepeatedSubstringPattern {



	/**
	 * 假设s 由n个子串s'组成，即s=n * s'; 2s=2*n*s‘, 去掉前尾各一个字符后前尾各少掉一个s',剩下2*s'*(n-1),包含n*s'
	 * @param s
	 * @return
	 */
	public boolean repeatedSubstringPattern(String s) {
        String doubleS = s + s;
        return doubleS.substring(1,  doubleS.length() - 1).contains(s);
	}
}
