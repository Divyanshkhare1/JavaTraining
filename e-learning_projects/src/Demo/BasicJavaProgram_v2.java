package Demo;

import java.util.Scanner;

public class BasicJavaProgram_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 , num2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("print the first no:");
		num1 = sc.nextInt();
		
		System.out.println("print the second no:");
		num2 = sc.nextInt();
		
		
		
		System.out.println("the arithmetic operation of two numbers are :");
		System.out.println("the addition of num1 and num2 is: " + (num1+num2));
		System.out.println("the multiplication of num1 and num2 is: "+ (num1*num2));
		System.out.println("the division of num1 and num2 is: "+ (num1/num2));
		System.out.println("the subtraction of num1 and num2 is: "+ (num1-num2));
	}

}
