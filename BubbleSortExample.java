package com.coding;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 */
public class BubbleSortExample {

	   public static void main(String[] args) {
		         int[] intArray = {4,1,34,89,33,-7};
		         for (int i=intArray.length-1;i>0;i--){
		             for (int j = 0; j < i; j++) {
		                 if(intArray[j] > intArray[j+1]){
		                     swap(intArray,j,j+1);
		                 }
		             }
		         }
		         for (int i = 0; i < intArray.length; i++) {
		             System.out.println(intArray[i]);
		         }
		         
		     }
		     public static void swap(int[] arr, int a, int b){
		         if(a==b){
		             return;
		         }
		         int temp=arr[a];
		         arr[a]=arr[b];
		         arr[b]=temp;
		     }
		     
		     
}  