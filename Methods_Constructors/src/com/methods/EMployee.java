package com.methods;

public class EMployee { //bean classes,POJO classes,DTO classes , Entity

	private int eid;
	private String ename;
	private double salary;
	
	public EMployee() {
		
		super();
		
	}
	
	public EMployee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EMployee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
