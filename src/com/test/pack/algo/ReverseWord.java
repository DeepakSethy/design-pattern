package com.test.pack.algo;

public class ReverseWord {

	public static void main(String[] args) {
		String ex = "The sky is blue ";
		reverseWords(ex);
	}

	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		// Split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			System.out.println("[" + arr[i] + "]");
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}

		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
}
