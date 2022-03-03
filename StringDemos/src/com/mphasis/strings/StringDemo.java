package com.mphasis.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = new String("Java");
		
		String str4 = new String("Java");
		
		String str2 = "Python";
		
		String str3 = "Python";
		
		System.out.println(str1.toString());
	
		System.out.println(str2);
		
		System.out.println(str1.equals(str4)); // it compare values or what it contain
		
		System.out.println(str1 == str4);
		
		System.out.println(str2.equals(str3));
		
		System.out.println(str2 == str3);
		
		
		str1 = str1.concat(" Lanquage");
		
		System.out.println(str1);
		
		str1 = str1 + " course";
		
		System.out.println(str1);

	}

}
