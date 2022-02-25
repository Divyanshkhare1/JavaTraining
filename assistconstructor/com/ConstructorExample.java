package com.assistconstructor.com;
class ConstructorExample {
 


  ConstructorExample() {
    System.out.println("Non Paramatrized Constructor Called:");
   
  }
ConstructorExample(String arg) {
    System.out.println("Paramatrized Constructor Called: with argument "+arg);
   
  }

  public static void main(String[] args) {

       ConstructorExample example1=new ConstructorExample();
       ConstructorExample example2=new ConstructorExample(" Divyansh Khare "); 
   
  
  }
}