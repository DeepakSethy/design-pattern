package com.test.rest.dummy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmp2 {
	public static void main(String[] args) {
		String regex = "^[1-9]\\d{2}-\\d{3}-\\d{4}$";

		final Map<Emp2, String> map1 = new HashMap();
		map1.put(new Emp2("Aditya", "Sethy"), "407eee-439-2003");
		map1.put(new Emp2("Aditya", "Sethy"), "43e7-439-2003");
		map1.put(new Emp2("Banshi", "M"), "437-439-2003");

		List<String> list = map1.values().stream().filter(v -> v.matches(regex)).collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
		System.out.println(list);
	}
}
