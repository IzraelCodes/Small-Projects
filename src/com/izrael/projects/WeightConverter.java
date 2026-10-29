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
		
		
		if(choice == 1) {
			System.out.print("Enter your weight in LBS and it will be converted to Kgs: ");
			weight = UserInput.nextDouble();
			
			newWeight = weight * 0.453592;
			System.out.printf("The new weight in kgs is: %.2f", newWeight);
		}
		
		
		else if(choice == 2) {
			System.out.println("Enter your weight in KGs and it will be converted to Lbs: ");
			weight = UserInput.nextDouble();
			
			newWeight = weight * 2.20462;
			System.out.printf("The new weight in lbs is: %.2f", newWeight);
		}
		else {
			System.out.println("That was not a valid choice mate.");
		}
		
		
		
		UserInput.close();
	}

}
