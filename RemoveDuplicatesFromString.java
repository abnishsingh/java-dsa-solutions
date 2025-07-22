package com.coding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		
		String a="ddbbaahjjjkkk";
		char c[]=a.toCharArray();
		
		Set<Character> charSet=new LinkedHashSet<Character>();
		for (Character cc : c) {
			charSet.add(cc);
		}
		
		StringBuilder sb=new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		System.out.println(sb.toString());
		
		//using streams
		a = Arrays.asList(a.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
		System.out.println(a);
	}
	
}
