package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruckApp fta = new FoodTruckApp();
		FoodTruck[] foodTrucks = fta.gatherFoodTrucks();
		
		boolean stillChoosingFromMenu = true;
		while (stillChoosingFromMenu) {
			int userChoice = fta.printMenu();
			switch (userChoice) {
			case 1: {
				System.out.println("All Trucks: ");
				for (FoodTruck truck : foodTrucks) {
					System.out.println(truck);
				}
				break;
			}
			case 2: {
				double totalRating = 0.0;
				for (FoodTruck truck : foodTrucks) {
					totalRating += truck.getTruckRating();
				}
				System.out.println("Average Rating: " + (totalRating / foodTrucks.length));
				break;
			}
			case 3: {
				int highestRatedIndex = 0;
				int highestRatedValue = foodTrucks[0].getTruckRating();
				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i].getTruckRating() > foodTrucks[highestRatedIndex].getTruckRating()) {
						highestRatedIndex = i;
						highestRatedValue = foodTrucks[i].getTruckRating();
					}
				}
				System.out.println("Highest Rated Truck(s):\n");
				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i].getTruckRating() == highestRatedValue) {
						System.out.println(foodTrucks[i]);
					}
				}
				break;
			}
			case 4: {
				System.out.println("Thanks for visiting!");
				stillChoosingFromMenu = false;
				break;
			}
			default: {
				System.out.println("Invalid entry. Please enter a number from 1-4.");
			}

			}
		}

		sc.close();
	}
	
	private FoodTruck[] gatherFoodTrucks() {
		Scanner sc = new Scanner(System.in);
		
		FoodTruck[] fullTruckArr = new FoodTruck[5];
		int lengthFinalArray = 5;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Food Truck Name: ");
			String currentTruckName = sc.nextLine();
			if (currentTruckName.equals("quit")) {
				lengthFinalArray = i;
				break;
			}

			System.out.print("Enter type of food for this Food Truck: ");
			String currentFoodType = sc.nextLine();

			System.out.print("Enter Food Truck's Rating (1-5): ");
			int currentTruckRating = sc.nextInt();
			while (currentTruckRating < 1 || currentTruckRating > 5) {
				currentTruckRating = sc.nextInt();
			}
			sc.nextLine();

			FoodTruck truck = new FoodTruck(currentTruckName, currentFoodType, currentTruckRating);
			fullTruckArr[i] = truck;
		}
		
		FoodTruck[] foodTrucks = new FoodTruck[lengthFinalArray];
		for (int i = 0; i < lengthFinalArray; i++) {
			foodTrucks[i] = fullTruckArr[i];
		}
		return foodTrucks;
	}
	
	private int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n--------------------------------------------");
		System.out.println("Please enter a number 1-4 for the following:");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		System.out.println("--------------------------------------------\n");
		int userChoice = sc.nextInt();
		return userChoice;
	}
	
	
}
