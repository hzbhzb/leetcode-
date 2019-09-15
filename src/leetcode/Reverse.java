package leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author huangzhebin
 *
 */
public class Reverse {
	
	public int reverse(int x) {
        int result = 0, y = 0;
        while(x != 0) {
            y = x % 10;
            
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && y > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && y < -8)) return 0;
            result = result * 10 + y;
            x = x / 10;
        }
        return result;
    }

}
