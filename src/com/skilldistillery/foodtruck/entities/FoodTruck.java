package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	private static int foodTruckIdGenerator = 0;
	private int foodTruckId;
	private String truckName;
	private String foodType;
	private int truckRating;
	
	public FoodTruck() {}
	public FoodTruck(String name, String type, int rating) {
		truckName = name;
		foodType = type;
		truckRating = rating;
		foodTruckIdGenerator++;
		foodTruckId = foodTruckIdGenerator;
	}
	public int getFoodTruckId() {
		return foodTruckId;
	}
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String name) {
		truckName = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String type) {
		foodType = type;
	}
	public int getTruckRating() {
		return truckRating;
	}
	public void setTruckRating(int rating) {
		truckRating = rating;
	}
	public String toString() {
		String truckInfoString = "ID: " + foodTruckId + "  Name: " + truckName
				+ "  Type: " + foodType + "  Rating: " + truckRating;
		return truckInfoString;
	}
	
}
