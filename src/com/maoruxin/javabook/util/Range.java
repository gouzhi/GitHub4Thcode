package com.maoruxin.javabook.util;

public class Range {
	// Produce a sequence [0..n)
	public static int[] range(int n){
		int[] result = new int[10];
		for(int i = 0;i < n;i++)
			result[i] = i;
		return result;
	}
	// Produce a sequence [start..end)
	public static int[] range(int start, int end){
		int sz = end - start;
		int[] result = new int[sz];
		for(int i = 0; i < sz;i++){
			result[i] = start + i;
		}
		return result;
	}
	
	//方法有限制条件
	// Produce a sequence [start..end) incrementing by step
	public static int[] range(int start, int end, int step){
		int sz = (end - start)/step;
	    int[] result = new int[sz];
	    for(int i = 0; i < sz; i++)
	      result[i] = start + (i * step);
	    return result;
	}
}