package com.izrael.projects;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		
		double num1;
		double num2;
		char operator;
		double result = 0;
		
		System.out.print("Enter the first number:");
		num1 = UserInput.nextDouble();
		
		System.out.println("Enter an operator (+, -, *,/,^): ");
		operator = UserInput.next().charAt(0);
		
		System.out.print("Enter the second number:");
		num2 = UserInput.nextDouble();
		
		switch(operator) {
			case '+' -> result = num1 + num2;
			case '-' -> result = num1 - num2;
			case '*' -> result = num1 * num2;
			case '/' -> result = (num2 == 0)? 0 : num1 / num2;
			case '^' -> result = Math.pow(num1, num2);
			default  -> System.out.println("Enter a valid operator.");
		}
		System.out.println("You picked this operator " + operator + " and the result is: " + result);
		
		UserInput.close();
	}

}
