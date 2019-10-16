package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间 给出一个区间的集合，请合并所有重叠的区间。
 * 
 * @author huangzhebin
 *
 */
public class Merge {

	
	public int[][] merge(int[][] intervals) {

		int[] flag = new int[intervals.length];

		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});

		List<int[]> list = new ArrayList();
		for (int i = 0; i < intervals.length; i++) {
			if (flag[i] == 0) {
				int start = intervals[i][0];
				int end = intervals[i][1];

				for (int j = i + 1; j < intervals.length; j++) {
					if (flag[j] == 0) {
						if (end >= intervals[j][0]) {
							if (end < intervals[j][1]) {
								intervals[i][1] = intervals[j][1];
								end = intervals[i][1];
							}
							flag[j] = 1;
						}
					}
				}
				flag[i] = 1;
				list.add(intervals[i]);
			}

		}

		return list.toArray(new int[0][]);

	}

}
