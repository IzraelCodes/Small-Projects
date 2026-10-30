package com.izrael.projects;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
	Scanner UserInput = new Scanner(System.in);
	
	double originalTemp;
	double newTemp;
	String unit;
	
	System.out.print("Enter the temperature:");
	originalTemp = UserInput.nextDouble();
	
	System.out.println("Convert to Celcius or Farenheit (C or F): ");
	unit = UserInput.next();
	
	System.out.println(originalTemp);
	System.out.println(unit);
	
	
	
	
	UserInput.close();
	}

}
