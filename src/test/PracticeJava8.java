package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJava8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.add("Lokesh");
		memberNames.add("Lokesh");
		memberNames.add("Lokesh");
		memberNames.add("Lokesh");
		
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		

		Map<String, List<Integer>> map1 = new HashMap<>();
		map1.put("A", Arrays.asList(null,null,1, 2, 4, 5, 6));

		Map<String, List<Integer>> map2 = new HashMap<>();
		map2.put("B", Arrays.asList(1, 4, 5, 6, 7));

		map1.putAll(map2);

		@SuppressWarnings("rawtypes")
		Set colSets = new HashSet<>();

		map1.forEach((k, v) -> colSets.addAll(v));
		colSets.stream().forEach(System.out::println);
		
		map2.entrySet().forEach(System.out::println);
		map2.keySet().forEach(System.out::println);
		map2.values().forEach(System.out::println);

/*		memberNames.stream().distinct().sorted().map(String::toUpperCase).forEach(System.out::println);

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println("Here Are Numbers" + p));

		IntStream intStream = "12345_abcdefg".chars();
		intStream.forEach(p -> System.out.println("2 Here Are Numbers" + p));

		// OR

		Stream<String> intStream1 = Stream.of("A$B$C".split("\\$"));
		intStream1.forEach(p -> System.out.println("Here Are chars" + p));

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		 * Stream<Integer> stream2 = list.stream(); List<Integer> evenNumbersList =
		 * stream2.filter(i -> i%2 == 0).collect(Collectors.toList());
		 
		// evenNumbersList.stream().forEach(System.out::println);
		Stream<Integer> stream2 = list.stream();
		Integer[] evenNumbersArr = stream2.filter(i -> i % 2 == 0).toArray(Integer[]::new);*/

		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");
		
		strings.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList()).forEach(System.out::println);
		strings.stream().sorted(String::compareTo).collect(Collectors.toList()).forEach(System.out::println);
		
		
		List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));
		
		Optional<Integer> max = integers.stream().reduce(Math::max);
	}
}
