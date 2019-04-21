package com.infotech.batch.model;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -6402068923614583448L;
	private Integer id;
	private String firstName;
    private Integer age;
    
    public Person() {}  

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Person(Integer id, String firstName, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}
      
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", age=" + age + "]";
	}
		

}
