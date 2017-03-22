package com.ashwani.poc;

public class InterfacePOC implements DefaultInterface{

	public static void main(String[] args) {
		System.out.println("Calling static method");
		DefaultInterface.showStaticDefaultMessage();
		
		System.out.println("Calling implemented method");
		new InterfacePOC().showMessage();
	}

	@Override
	public void showMessage() {
		System.out.println("message from implemented method. Calling other overloaded methods");	
		showDefaultMessage();
		showAnotherDefaultMessage();
	}
}

@FunctionalInterface
interface DefaultInterface {
	
	public void showMessage();
	
	default void showDefaultMessage() {
		System.out.println("inside showDefaultMessage");
	}
	
	default void showAnotherDefaultMessage() {
		System.out.println("inside showAnotherDefaultMessage");
	}
	
	public static void showStaticDefaultMessage() {
		System.out.println("inside showStaticDefaultMessage");
	} 
	
}
