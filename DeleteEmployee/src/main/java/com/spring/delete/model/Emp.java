package com.spring.delete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
	@Id
	int id;
	String name;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "salary " +salary+"]";
	}
	public Emp(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {}

}