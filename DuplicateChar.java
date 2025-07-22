package com.coding;

import java.util.LinkedHashSet;

public class DuplicateChar {

    public static void main(String[] args) {
        String input="abbczzccdddee";
        StringBuilder sb=new StringBuilder();
        LinkedHashSet<Character> s=new LinkedHashSet<Character>();
        char i[]=input.toCharArray();
        for(char c: i){
            if(s.add(c)){
                sb.append(c);
            }
        }
        System.out.println(s);
        System.out.println(sb);
    }
}
