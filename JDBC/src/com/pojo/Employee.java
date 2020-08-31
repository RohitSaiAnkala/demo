package com.pojo;

public class Employee {

	private String empName;
	private int empId;
	private int salary;
	private String technology;
	public Employee(){
		
	}
	public Employee(String empName, int empId, int salary, String technology) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.technology = technology;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", technology=" + technology
				+ "]";
	}
}
