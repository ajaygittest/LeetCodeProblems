package com.javaAdvance;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String args[]) {
		  int[] a = {1, 2, 3, 0, 0, 0};
	        int m = 3;
	        int[] b = {2, 5, 6};
	        int n = 3;
		mergedArray(a, m, b, n);

	}

	public static void mergedArray(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = n + m - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}

		while (j >= 0) {
			nums1[k--] = nums2[j--];

		}
		System.out.println(Arrays.toString(nums1));

	}
}