package com.ExplicitTypecast.com;


class ExplicitTypeCast {
	  public static void main(String[] args) {
	  
	    double num = 10.99;
	    System.out.println("The double value: " + num);

	  
	    int data = (int)num;
	    System.out.println("The integer value: " + data);
	  }
	}


	class ImplicitTypeCast {
	  public static void main(String[] args) {
	   
	    int num = 10;
	    System.out.println("The integer value: " + num);


	    double data = num;
	    System.out.println("The double value: " + data);
	  }
	}