package com.test.pack.algo;

public class FibSeries {
	public static void main(String[] args) {
		int N = 10;
		fibonacci(15);
	}

	private static void fibonacci(int N) {
		int num1=0,num2=1;
		int counter = 0;
		
		
		while(counter < N) {
			System.out.println(num1);
			int num3 = num1 + num2; //0 + 1
			num1 = num2; // 0 = 1
			num2 = num3; // 1 = 1
			counter = counter + 1;
		}
		
	}
}
