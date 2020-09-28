package com.test.pack.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CalendarConflict {
	public static List<List<Interval>> conflictAppointment(Interval[] intervals) {

		Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		List<List<Interval>> result = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < intervals.length - 1; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (intervals[i].end > intervals[j].start) {
					List<Interval> conflicts = new ArrayList<>();
					conflicts.add(intervals[i]);
					conflicts.add(intervals[j]);
					result.add(conflicts);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Interval[] intervals = { new Interval(4, 5), new Interval(2, 3), new Interval(3, 6), new Interval(5, 7),
				new Interval(7, 8) };
		List<List<Interval>> result = conflictAppointment(intervals);
		result.stream().map((items) -> {
			System.out.println("Conflicts: ");
			return items;
		}).forEachOrdered((items) -> {
			items.forEach((item) -> {
				System.out.println("[" + item.start + "," + item.end + "]");
			});
		});
	}
}
