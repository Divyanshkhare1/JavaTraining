package com.MethodImplementation;


class Data {
	   
    public String getName() {
        return "Divyansh Khare";
    }
   public static int getRollNumber()
{
     return 100;
}
    
 
}
public class MethodImplementation {
    public static void main(String[] main){
        Data d = new Data();
        System.out.println("Calling instance method using object"+d.getName());
       System.out.println("Calling static method using class name"+Data.getRollNumber());
    }
}