package com.mphasis.exp;

public class addNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
			
			try {
				
				for (int i = 0; i < args.length; i++) {

				
			sum = sum + Integer.parseInt(args[i]);// A = A+B         
				}
				}catch(NumberFormatException e){
				
			    System.out.println(" is not a  number" );
			}
			finally {
				//code which is mandatory to execute irrespective of execution
				System.out.println("finally block executed...");
			}
			System.out.println(sum);
		}
		
	}


