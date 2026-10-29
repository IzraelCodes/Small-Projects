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
		
		System.out.print("Choose and option: ");
		choice = UserInput.nextInt();
		
		// Option 1 convert lbs to kgs
		if(choice == 1) {
			System.out.print("Enter your weight in LBS and it will be converted to Kgs: ");
			weight = UserInput.nextDouble();
			
			newWeight = weight * 0.453592;
			System.out.printf("The new weight is: %.2f", newWeight);
		}
		
		// Option 2 convert kgs to lbs
		if(choice == 2) {
			System.out.println("Enter your weight in KGs and it will be converted to Lbs: ");
			weight = UserInput.nextDouble();
		}
		// else print not a valid choice 
		
		
		UserInput.close();
	}

}
