package com.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentMethods {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			

				System.out.println("Enter the product price and percentage");
			
				double price = scanner.nextDouble();
				double percentage = scanner.nextDouble();
				
				DifferentMethods diff = new DifferentMethods();
				System.out.println(diff.toString());		
				
//				double discount = diff.findDiscount(price);
				double discount = diff.findDiscount(price,percentage);

				
				System.out.println("Your discount amount is "+ discount );
		
				
				
				
		List<EMployee> emplist =		DifferentMethods.getListEMployees();
		
			System.out.println(emplist);
		
		}



	public double findDiscount(double price) {
		
		
		return (price*10)/100;
	}

public double findDiscount(double price,double percentage) {
		
		
		return (price*percentage)/100;
	}


	@Override //runtime polymorphism
	public String toString() {
		return "This class override toString()";
	}
	
	public static List<EMployee> getListEMployees() {
		
			List<EMployee> list = new ArrayList<EMployee>();
	
			list.add(new EMployee(101,"chinu",900));
			list.add(new EMployee(102,"div",12000));
			list.add(new EMployee(104,"ford",12000));
			
			
			return list;
	
	
	}
	
	
}