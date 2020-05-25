package com.test.rest.dummy;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {
	public static void main(String[] args) {
		Set<String> words =  new HashSet<>();
		words.add("Hello");
		words.add("hello");
		System.out.println(words);
	}
}
