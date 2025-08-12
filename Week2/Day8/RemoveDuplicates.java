package com.leetcode;

public class RemoveDuplicates {
	class Solution {
	    public int removeDuplicates(int[] nums) {
	     int n = nums.length;
	        if (n == 0) return 0;

	        int slow = 0;
	        for (int fast = 1; fast < n; fast++) {
	            if (nums[fast] != nums[slow]) {
	                nums[++slow] = nums[fast];
	            }
	        }
	        return slow + 1;
	    }
	}
}
