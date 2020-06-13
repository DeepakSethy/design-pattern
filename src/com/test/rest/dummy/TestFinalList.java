package com.test.rest.dummy;

import java.util.Arrays;
import java.util.List;

public class TestFinalList {
	public static void main(String[] args) {
		// final ArrayList list = new ArrayList<>();
		final List fixedList = Arrays.asList(1, 2, 3, 4, 5);
		fixedList.add(6);
		fixedList.forEach(System.out::println);
	}
}
