package com.coding;

public class LoweUpper {

    public static void main(String[] args) {

        String str="aBnIsh Singh";
        StringBuilder sb=new StringBuilder();

        char c[]=str.toCharArray();

        for (char x:c) {
            if(Character.isLowerCase(x)){
                sb.append(Character.toUpperCase(x));
            }
            else if(Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }
            else{
                sb.append(x);
            }
        }
        System.out.println(sb.toString());
    }
}
