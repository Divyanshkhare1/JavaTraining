package com.mphasis.exp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//throw new ArithmeticException(); //explicitly	raising exeption
		
		System.out.println("Welcome to mphasis bank");
		
	int accounts[]= {101,102,103};
	String names[] = {"smth","king","ford","scooty"};
	double balance[] = {5000.0,7000.0,8000.0,3000.0};
	
	for (int i =0; i< accounts.length; i++) {

		System.out.println(accounts[i] + " " + names[i] + "  " +balance[i]);
		
	}
 }
}