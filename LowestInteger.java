package com.coding;

import java.util.LinkedList;

public class LowestInteger {

	public static void main(String[] args) {
		
		int a[]= {-2,-4,-1,16};
		
		for (int i = a.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(a[j]>a[j+1]) {
//					System.out.println(a[j]);
					swap(a, j, j+1);
					
				}
				
			}
		}
		LinkedList<Object> d=new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				d.add(a[i]);	
			}
			
		}
//		System.out.println(d.get(0));
		int o = (int) d.get(0);
		System.out.println(o-1);
		
	}
	
	public static void swap(int a[], int i, int j) {
		
		if(i==j) {
			return;
		}
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return;
		
	}

}
