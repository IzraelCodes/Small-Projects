package com.izrael.projects;
import java.util.Scanner;
public class WeightConverter {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		
		double weight;
		double newWeight;
		int choice;
		
		System.out.println("Welcome to the Weight conversion calculator");
		System.out.println("1. Convert lbs to Kgs");
		System.out.println("2. Convert kgs to Lbs");
		
		System.out.print("Choose and option");
		choice = UserInput.nextInt();
	
		System.out.println(choice);
		
		
		// Option 1 convert lbs to kgs
		
		// Option 2 convert kgs to lbs
		
		// else print not a valid choice 
		
		
		UserInput.close();
	}

}
