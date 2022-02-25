package com.AccessModifier;

class Data {
    private String name;
    public int roll_number=100;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name= name;
    }
}
public class AccessModifierExample {
    public static void main(String[] main){
        Data d = new Data();

        d.setName("Divyansh Khare");
        System.out.println("Accessing private variable by calling public getter method"+d.getName());
       System.out.println("Accessing public variable by calling directly "+d.roll_number);
    }
}