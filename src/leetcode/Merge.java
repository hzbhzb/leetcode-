package leetcode;

import java.util.ArrayList;

import java.util.List;

/**
 * 56. 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * @author huangzhebin
 *
 */
public class Merge {
	
    public int[][] merge(int[][] intervals) {
    	
    	int []flag = new int[intervals.length];
    	
    	for (int i = 0; i < intervals.length; i++) {
    		for (int j = 0; j < intervals.length - i - 1; j++) {
    			if (intervals[j][0] > intervals[j+1][0]) {
    				int [] x = intervals[j];
    				intervals[j] = intervals[j+1];
    				intervals[j+1] = x;
    			}
    		}
    	}
    	
    	List<int[]> list = new ArrayList();
    	for (int i = 0; i < intervals.length; i++) {
    		if (flag[i] == 0) {
    			int start = intervals[i][0];
        		int end = intervals[i][1];
        		
        		for (int j = i; j < intervals.length; j++) {
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
    	int[][] ret = new int[list.size()][2];
    	for (int i = 0; i < list.size(); i++) {
    		ret[i] = list.get(i);
    	}
    	return ret;
        
    }

}
