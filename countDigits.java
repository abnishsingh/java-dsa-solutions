package com.coding;

public class countDigits
{
  public static void main(String[] args) {
	  
    String s="coding is easier in Java 123456789089";
    countDig(s);
  }
  
  public static void countDig(String s) {
	  int count=0;
	  StringBuilder alpha=new StringBuilder();
	  StringBuilder num=new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	    	
	    	if(Character.isDigit(s.charAt(i))) {
	    		count++;
	    		alpha.append(s.charAt(i));
	    	}
	    	
	    	if(Character.isAlphabetic(s.charAt(i))) {
	    		count++;
	    		num.append(s.charAt(i));
	    	}
		}
	    System.out.println(count);
	    System.out.println("Alphabet is: "+num.toString());
	    System.out.println("Numeric is: "+alpha.toString());
  }
  
}