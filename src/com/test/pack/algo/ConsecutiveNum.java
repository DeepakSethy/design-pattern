package com.test.pack.algo;

public class ConsecutiveNum {
	public static int consecutiveNumbersSum(int N) {
        int rst = 0;
        // Make N = 2 * N
        //N <<= 1;   
        // Traverse the value of a
        for (int i = 1; i * i < N; i++) {
            // a * b = 2N and a + b is odd
            if (N % i == 0 && ((i + N / i) & 1) == 1) {
            	System.out.println(N);
                rst++;
            }
        }
        return rst;
    }
	
	public static void main(String[] args) {
		consecutiveNumbersSum(10);
	}
}
