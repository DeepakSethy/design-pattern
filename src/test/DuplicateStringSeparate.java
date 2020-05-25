/*package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateStringSeparate {

	// Driver code
	public static void main(String[] args) {
		String arr[] = { "deepak", "for", "deepak", "a", "portal", "to", "learn", "can", "be", "computer", "science",
				"zoom", "yup", "fire", "in", "be", "data", "deepak" };
		String sol = findWord(arr);

		HashSet set2 =

				// Print word having highest frequency
				System.out.println(sol);
	}

	private static String findWord(String[] arr) {
		// Create HashMap to store word and it's frequency
		HashMap<String, Integer> hs = new HashMap<>();

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {

			if (hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i]) + 1);
			}
			// Otherwise add word to HashMap
			else {
				System.out.println("else Arr ++ --->" + arr[i]);
				hs.put(arr[i], 1);
			}
		}

		// Create set to iterate over HashMap
		Set<Map.Entry<String, Integer>> set = hs.entrySet();
		System.out.println("set -->" + set);
		String key = "";
		int value = 0;

		for (Map.Entry<String, Integer> me : set) {
			// Check for word having highest frequency
			if (me.getValue() > value) {
				value = me.getValue();
				System.out.println("Value -->" + value);
				key = me.getKey();
				System.out.println("Key -->" + key);
			}
		}

		// Return word having highest frequency
		return key;
	}
}
*/