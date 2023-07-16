package com.java.abstract_Class;

public class Child_Abstract extends AbstractDemo {

	public static void main(String[] args) {

		AbstractDemo obj = new Child_Abstract();
		
		

		System.out.println("\n This is output as static way \n");
		AbstractDemo.company(companyname);
		AbstractDemo.companyName();
		AbstractDemo.company("WNS");

		System.out.println("\n This is calling way Object \n");
		obj.finance();
		obj.devlopment();
		obj.testing();
		obj.security();
		obj.transport();

	}

	@Override
	public void finance() {
		// TODO Auto-generated method stub
		System.out.println("This is Finance Dept from child class");

	}

	@Override
	public void devlopment() {
		// TODO Auto-generated method stub
		System.out.println("This is Devlopment Dept from child class");
	}

	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("This is Testing Dept from child class");
	}

	@Override
	public void security() {
		// TODO Auto-generated method stub
		System.out.println("This is security Dept from child class");
	}

	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("This is Transport Dept from child class");
	}

}
