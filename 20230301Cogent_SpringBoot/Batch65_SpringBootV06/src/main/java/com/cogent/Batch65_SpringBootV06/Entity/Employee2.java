package com.cogent.Batch65_SpringBootV06.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table               //(name="emp")

public class Employee2 {
	@Id                      //primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)  //
	
	int id;
    String name;    
	String dept;
	
	float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "!!hii this is Employee [\n id=" + id + ", \n empName=" + name + ", \n dept=" + dept + ", \n salary=" + salary + "]";
	}
	
}
