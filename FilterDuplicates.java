package com.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class FilterDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		System.out.println("\nFiltered duplicates : " + processList(list));
		Set<String> r=new HashSet<String>();
		r.addAll(list);
		System.out.println("Filtered List: "+r);
		
		System.out.println("=====================");
		
		String w="this is test of test gutt";
		StringTokenizer st=new StringTokenizer(w);
		System.out.println("Using String Tokinizer: "+st.countTokens());
		String str=w.replaceAll(" ", "-");
		String t[]=str.split("-");
		System.out.println("Words Count: "+t.length);
		System.out.println("Characters Count: "+str.length());
		
		
	}

	public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		return resultSet;

	}


}
