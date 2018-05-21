package com.sharpit.java.accessmodifiers;

public class TestPrivateModifier {
	
	private int number;
	protected int number2; //default access modifier
	public byte print() {
		System.out.println("Number >> "+number);
		System.out.println("Number >> "+number2);
		return (byte)number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPrivateModifier modifier = new TestPrivateModifier();
		System.out.println("Number >> "+modifier.number);
		System.out.println("Number >> "+modifier.print());
	}

}


