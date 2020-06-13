package com.test.pack.algo;

import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
		//Java 8 
		/**IntStream.rangeClosed(1,100)
			.mapToObj( i -> i % 3 == 0 ? (i % 5 ==0 ? "FizzBuzz" : "Fizz") : (i%5 == 0 ? "Buzz" : i))
			.forEach(System.out::println);
		
		System.out.println("===========================");
		
		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
				.forEach(System.out::println);**/
		
		for(int i=1;i<=100;i++) {
			if(((i%5) == 0) && ((i%7) ==0)) { //Is it multiple of two numbers
				System.out.println("FizzBuzz");
			} else if((i%5) == 0) {
				System.out.println("Fizz");
			} else if((i%7) == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
		
	}
}
