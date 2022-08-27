package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FoodTruck[] foodTruckArr = new FoodTruck[5];
		
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
			
			FoodTruck truck = new FoodTruck(currentTruckName, currentFoodType, currentTruckRating);
			foodTruckArr[i] = truck;
		}
		
		System.out.println(foodTruckArr[0]);
		System.out.println(foodTruckArr[1]);
		System.out.println(foodTruckArr[2]);
		System.out.println(foodTruckArr[3]);
		
		boolean stillChoosingFromMenu = true;
		while (stillChoosingFromMenu) {
			System.out.println("\n--------------------------------------------");
			System.out.println("Please enter a number 1-4 for the following:");
			System.out.println("1. List all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			System.out.println("--------------------------------------------\n");
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1 : {
				System.out.println("All Trucks: ");
				for (FoodTruck truck : foodTruckArr) {
					System.out.println(truck);
				}
				break;
			}
			case 2 : {
				double totalRating = 0.0;
				for (FoodTruck truck : foodTruckArr) {
					totalRating += truck.getTruckRating();
				}
				System.out.println("Average Rating: " + (totalRating/foodTruckArr.length));
				break;
			}
			case 3 : {
				int highestRatedIndex = 0;
				for (int i = 0; i < foodTruckArr.length; i++) {
					if (foodTruckArr[i].getTruckRating() > foodTruckArr[highestRatedIndex].getTruckRating()) {
						highestRatedIndex = i;
					}
				}
				System.out.println("Highest Rated Truck:\n" + foodTruckArr[highestRatedIndex]);
				break;
			}
			case 4 : {
				System.out.println("Thanks for visiting!");
				stillChoosingFromMenu = false;
				break;
			}
			}
		}
		


//		sc.close();
	}
	

}
