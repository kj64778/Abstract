package com.java.abstract_Para_constractor;

public class Runner extends Parent_C {

	public Runner(String name) {
		super(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent_C obj = new Runner("Infosys");
		System.out.println();

		obj.java();
		obj.chatGPT();
		obj.development();
		obj.testing();
		obj.finanace();
		obj.Banking();

	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This is java method coming from Parent_C class");

	}

	@Override
	public void chatGPT() {
		// TODO Auto-generated method stub
		System.out.println("This is chatGPT method coming from Parent_C class");
	}

	@Override
	public void development() {
		// TODO Auto-generated method stub
		System.out.println("This is Development method coming from Parent_B class");
	}

	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("This is Testing method coming from Parent_B class");
	}

	@Override
	public void finanace() {
		// TODO Auto-generated method stub
		System.out.println("This is Finance method coming from Parent_A class");
	}

	@Override
	public void Banking() {
		// TODO Auto-generated method stub
		System.out.println("This is Banking method coming from Parent_A class");
	}

}
