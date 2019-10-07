package leetcode;

/**
 * 509. 斐波那契数
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和
 * @author huangzhebin
 *
 */

public class Fib {

	public int fib(int N) {
		
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		int[]f = new int[N+1];
        f[0] = 0;
        f[1] = 1;
		for (int i = 2; i <= N; i++)
			f[i] = f[i-1] + f[i-2];
		return f[N];
	}

}
