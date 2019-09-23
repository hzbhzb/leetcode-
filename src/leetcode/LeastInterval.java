package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 621. 任务调度器
 * 给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26
 * 种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。
 * 
 * 然而，两个相同种类的任务之间必须有长度为 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。
 * 
 * 你需要计算完成所有任务所需要的最短时间。
 * 
 * @author huangzhebin
 *
 */
public class LeastInterval {

	public static int leastInterval(char[] tasks, int n) {
		int t = 0;
		int sum = 0;
		int[] counts = new int[26];
		for (int i = 0; i < tasks.length; i++) {
			counts[tasks[i] - 65] += 1;
		}

		int i = counts.length - 1;

		Arrays.sort(counts);
		while (sum < tasks.length) {

			while (i >= 0) {
				if (counts[i] > 0)
					break;
				i -= 1;
			}

			if (i >= 0) {
				counts[i] -= 1;

				i -= 1;
				t += 1;
				sum += 1;
				if (t >= (n + 1) && t % (n + 1) == 0) {
					i = counts.length - 1;
					Arrays.sort(counts);
				}

			} else {

				if (t > n + 1)
					t = t + (n + 1) - t % (n + 1);
				else
					t = n + 1;
				i = counts.length - 1;
				Arrays.sort(counts);
			}
		}

		return t;
	}

}
