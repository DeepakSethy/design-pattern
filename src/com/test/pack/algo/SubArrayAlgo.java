package com.test.pack.algo;

public class SubArrayAlgo {
	public static void main(String[] args) {
		int arr[] = { 10, 2, -2, -20, 10 };//
//		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here > 0)
				max_ending_here = 0;
		}

		System.out.println(max_so_far);
	}

}
