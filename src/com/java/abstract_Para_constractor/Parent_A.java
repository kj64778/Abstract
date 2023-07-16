package com.java.abstract_Para_constractor;

public abstract class Parent_A {

	public String companyName;

	public Parent_A(String name) {
		companyName = name;
		System.out.println("This is coming from Parent_A contractor : "+companyName);
	}

	public abstract void finanace();

	public abstract void Banking();
}
