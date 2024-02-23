package com.ben.java8;

public class Employee 
{
	public Employee(String ename, int id, String deptName, String address, Long salary) {
		super();
		this.ename = ename;
		this.id = id;
		this.deptName = deptName;
		this.address = address;
		this.salary = salary;
	}
	private String ename;
	private int id;
	private String deptName;
	private String address;
	
	private Long salary;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptNo() {
		return deptName;
	}
	public void setDeptNo(String deptNo) {
		this.deptName = deptNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}
	
}
