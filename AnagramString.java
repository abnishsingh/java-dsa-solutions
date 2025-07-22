package com.coding;

import java.util.Arrays;

/**
 *  An anagram is a word or phrase that's formed by rearranging the letters of another word or phrase. Ex. KEEP & PEEK are Anagram
 */
public class AnagramString {

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
	}
	
	public static void isAnagram(String a, String b) {
		String str1=a.replaceAll("\\s", "");
		String str2=b.replaceAll("\\s", "");
		
		boolean bool=true;
		if(str1.length() != str2.length()) {
			bool =false;
		}else {
			char[] chr1=str1.toLowerCase().toCharArray();
			char[] chr2=str2.toLowerCase().toCharArray();
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			bool=Arrays.equals(chr1, chr2);
		}
		if(bool) {
			System.out.println("Its an anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
	
}
