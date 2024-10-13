package com.practice.app;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}
	
	public String method01() {
		return "Hello World";
	}
	
	public int method02(int num1, int num2) {
		return num1 + num2;
	}
	
	public String[] method03(int num1, int num2) {
		String result = String.format("SUM: %d, DIF: %d", num1 + num2, num1 - num2);
		return result.split(", ");
	}
	
}
