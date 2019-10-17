package leetcode;

/**
 * 60. 第k个排列
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * 
 * "123" "132" "213" "231" "312" "321" 给定 n 和 k，返回第 k 个排列。
 * 
 * @author huangzhebin
 *
 */
public class GetPermutation {

	int total = 0;
	String ret;
	boolean isGet;

	public String getPermutation(int n, int k) {

		getResult("", n, k);
		return ret;
	}

	private void getResult(String s, int n, int k) {
		if (s.length() == n) {
			if (total == k) {
				ret = s;
			} else
				total += 1;

		} else {
			for (int j = 1; j <= n; j++) {
				if (!s.contains(String.valueOf(j))) {
					String newStr = s + j;
					if (ret != null)
						break;
					getResult(newStr, n, k);
				}

			}

		}
	}

}
