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
	unit = UserInput.next().toUpperCase();
	
	newTemp =(unit.equals("C")) ? (originalTemp - 32) * 5.0/9.0 : (originalTemp * 9.0 / 5.0 ) + 32;
	System.out.println("Converted Temperature: "+ newTemp);
	
	
	UserInput.close();
	}

}
