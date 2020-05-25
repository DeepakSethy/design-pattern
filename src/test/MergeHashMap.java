package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MergeHashMap {

	public static void main(String[] args) {
		ConcurrentMap<String, List<String>> mapGlobal = new ConcurrentHashMap<>();
		ConcurrentMap<String, List<String>> mapAdded = new ConcurrentHashMap<>();

		List<String> listA = new ArrayList<>();
		listA.add("1");
		listA.add("3");
		listA.add("5");
		listA.add("4");
		listA.add("2");

		List<String> listB = new ArrayList<>();
		listB.add("5");
		listB.add("4");
		listB.add("3");
		listB.add("6");
		listB.add("7");

		mapGlobal.put("A", listA);
		mapAdded.put("B", listB);

/*		mapAdded.forEach((k, v) -> mapGlobal.merge(k, v, (v1, v2) -> {
			Set<String> set = new TreeSet<>(v1);
			set.addAll(v2);
			System.out.println("First Logic --> "+new ArrayList<>(set));
			return new ArrayList<>(set);
		}));*/

		mapAdded.entrySet().parallelStream().forEach(e -> mapGlobal.merge(e.getKey(), e.getValue(), (v1, v2) -> {
			Set<String> set = new TreeSet<>(v1);
			set.addAll(v2);
			System.out.println("Second Logic --> "+new ArrayList<>(set));
			return new ArrayList<>(set);
		}));

	}
}
