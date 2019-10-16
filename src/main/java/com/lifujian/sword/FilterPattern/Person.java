package com.lifujian.sword.FilterPattern;

public class Person {


	private String name;
	private String gender;//性别
	private String maritalStatus;//是否结婚   marital  婚姻的

	public Person(String name,String gender,String maritalStatus){
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}


}
