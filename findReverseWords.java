package com.coding;

import java.util.HashSet;

public class findReverseWords {

    public static void main(String[] args) {

        String input[]= {"iwik","apple","mango","elppa","grape","kiwi"};

        HashSet<String> set=new HashSet<>();
        for (String st : input){
            set.add(st);
        }

        for(String str : input){
            String rev=new StringBuilder(str).reverse().toString();
            if(set.contains(rev) && !str.equals(rev)){
                System.out.println(rev);
                set.remove(rev);
                set.remove(str);
            }
        }



    }
}
