package com.coding;

public class LeaderNumbers {
    public static void main(String[] args) {
        int[] s = {16, 17, 4, 3, 5, 2};
        int n = s.length;

        System.out.print("Leader numbers: ");

        int maxFromRight = s[n - 1];
        System.out.print(maxFromRight + " "); // Last element is always a leader

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (s[i] > maxFromRight) {
                maxFromRight = s[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

