package com.mphasis.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Syntax1
		
		int arr1[] = {101,102,103,104,105};
		
//		int[] arr1 = {101,102,103,104,105};
		
//		int[]
//		[]arr1		
//		arr1[]
//		
		
		int[] a1,a2;
		
		
//		
//		int arr[];
//		int x;
//		
		int arr[],x;
			
		
		
		System.out.println(arr1.length);
//		System.out.println(arr1);
		System.out.println(arr1[0]);
		
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
			
		}
		
		
		
//	syntax2
		int arr2[] = new int[4];
		
		arr2[0] = 701;
		arr2[1] = 702;
		arr2[2] = 703;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for (int element : arr2) { // foreach can be used in arrays and collection
			System.out.println(element);
		}
		
		
		System.out.println(arr2.length);
		System.out.println(arr2[0]);
		System.out.println(arr2[3]);
		
	}

}
