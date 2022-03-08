package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld myObj = new HelloWorld();
		
		myObj.helloWorld();
		myObj.printMessage("Hello World", "This is some text", 10);
		String result = myObj.returnString("Hello", "This is a returned string");
		System.out.println(result);
	}
	
}
