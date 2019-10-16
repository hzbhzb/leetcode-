package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * 
 * @author huangzhebin
 *
 */
public class NewInterval {

	public int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> ret = new ArrayList<int[]>();
		boolean isAdded = false;
		for (int i = 0; i < intervals.length; ++i) {
			if (newInterval[0] > intervals[i][1]) {
				ret.add(intervals[i]);
			} else if (newInterval[1] < intervals[i][0]) {
				if (!isAdded) {
					ret.add(newInterval);
					isAdded = true;
				}
				ret.add(intervals[i]);
			} else {
				if (!isAdded) {
					newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
					newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
				}
			}
		}
		if (!isAdded)
			ret.add(newInterval);
		return ret.toArray(new int[0][]);

	}

}
