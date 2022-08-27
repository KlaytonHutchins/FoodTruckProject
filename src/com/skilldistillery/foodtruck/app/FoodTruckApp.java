package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Food Truck Name: ");
			String currentTruckName = sc.next();
			if (currentTruckName.equals("quit")) {
				break;
			}

			System.out.print("Enter type of food for this Food Truck: ");
			String currentFoodType = sc.next();

			System.out.print("Enter Food Truck's Rating: ");
			int currentTruckRating = sc.nextInt();
			
			// TODO: Instantiate current truck as new object
			
		}
		
		boolean stillChoosingFromMenu = true;
		while (stillChoosingFromMenu) {
			System.out.println("--------------------------------------------");
			System.out.println("Please enter a number 1-4 for the following:");
			System.out.println("1. List all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			System.out.println("--------------------------------------------");
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1 : {
				break;
			}
			case 2 : {
				break;
			}
			case 3 : {
				break;
			}
			case 4 : {
				System.out.println("Thanks for visiting!");
				stillChoosingFromMenu = false;
				break;
			}
			}
		}
		

//		FoodTruck[]

//		sc.close();
	}
	

}
