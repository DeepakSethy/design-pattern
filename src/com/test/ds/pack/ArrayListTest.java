package com.test.ds.pack;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of the array....");
			int n = sc.nextInt();
			System.out.println(n);
			ArrayList<Integer> arrlist = new ArrayList<Integer>();
			//Integer[] destArray = new Integer[n];
			int[] a = new int[n];
			 System.out.println("Enter elements to the array..... ");
			 for(int i=0; i<n; i++) {
				 a[i]=sc.nextInt();
		      }
			 for (int i = 0; i < a.length; i++) {
		            System.out.println(a[i]);
		        }
			
			
	}

}