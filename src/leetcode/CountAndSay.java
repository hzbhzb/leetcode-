package leetcode;

/**
 * 38.Count and Say
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

 * @author huangzhebin
 *
 */

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        countAndSay(5);
	}
	
    public static String countAndSay(int n) {
        
    	if (n == 1)
    	   return "1";
    	//得到上一个序号对应的字符串
    	String s = countAndSay(n - 1);
    	int count = 1;
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < s.length(); ) {
    		int j = i + 1;
    		for (; j < s.length(); j++ ) {
    			if (s.charAt(i) == s.charAt(j)) {
        			count += 1;
        		} else {
        			
        			break;
        		}
        			
    		}
    		sb.append(String.valueOf(count)).append(s.charAt(i));
    		i += count;
			count = 1;
			
    	}
    	System.out.println(sb.toString());
    	return sb.toString();
    }

}
