package leetcode;

import java.util.ArrayList;

import java.util.List;

public class SpiralOrder {

	public List<Integer> spiralOrder(int[][] matrix) {
		
		
		int size = 0;
		for (int  i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) 
				size+=1;
		}
		int []a = new int[size];
		int round = matrix.length - 2;
		
		int n = matrix.length;
		for (int i = 0; i <= round; i++) {
			
			for (int j = i; j <= n - 2 - i; j++) {
				a[i] =  matrix[i][j];
				a[i + (n-i-1)] =  matrix[j][n - i - 1];
				a[i + (n-i-1)*2] =   matrix[n - i - 1][n - j - 1];
				a[i + (n-i-1)*3] =  matrix[n - j - 1][i];
				
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i < a.length; i++) {
			list.add(a[i]);
		}
		return list;

	}

}
