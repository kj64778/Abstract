package com.java.abstract_Class;

public abstract class AbstractDemo {
	static String companyname = "Infosys";

	public static void companyName() {
		System.out.println("Company Name is : " + companyname);
	}
	
	

	public static void company(String companyname) {
		System.out.println("This is company method parameterized : " + companyname);
	}
	
	public AbstractDemo () {
		System.out.println("This is Parent Conctractor");
	}

	public abstract void finance();

	public abstract void devlopment();

	public abstract void testing();

	public abstract void security();

	public abstract void transport();
	
	

//	public static void main(String[] args) {
//		System.out.println(companyname);
//		companyName();
//		company("TATA");
//
//	}

}
