package leetcode;

/**
 * 70. 爬楼梯 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * 注意：给定 n 是一个正整数
 * 
 * @author huangzhebin
 *
 */
public class ClimbStairs {

	public int climbStairs(int n) {

		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int[] counts = new int[n];
		counts[0] = 1;
		counts[1] = 2;

		for (int i = 2; i < n; i++) {
			counts[i] = counts[i - 1] + counts[i - 2];
		}
		return counts[n - 1];
	}

}
