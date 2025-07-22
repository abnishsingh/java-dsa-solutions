package com.coding;
import java.util.List;
import java.util.Random;
 
public class ForEachListEx {
 
	public static void main(String a[]) {
		
		Random random = new Random();
		random.ints().limit(1).forEach(System.out::println);
	}
 
    public static void iterateList(List<String> countryList) {
 
        System.out.println("<-----Iterating in normal way----->");
        for(String country:countryList) {
            System.out.println(country);
        }
        
    }
 
    public static void iterateListUsingForEach(List<String> countryList) {
 
        System.out.println("\n<---Iterating using forEach method--->");
        countryList.forEach(abnish->System.out.println(abnish));
        countryList.forEach(a->{
        	System.out.println("charAt2-------"+a.charAt(2));
        });
        countryList.forEach(abnish ->{
        	System.out.println("under 8 " +abnish);
        });
    }
}