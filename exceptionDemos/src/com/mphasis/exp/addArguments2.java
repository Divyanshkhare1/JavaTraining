package com.mphasis.exp;

public class addArguments2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
		int sum =0;
		for(int i =0;i<args.length;i++) {
			
			sum+= Integer.parseInt(args[i]);
		
		}
	

		
System.out.println("Sum="+sum);

	}catch (NumberFormatException nfe) {
		System.err.println("one of the comma nd-line is not an integer");
	}

}
}
