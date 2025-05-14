package test;

import java.util.ArrayList;
import java.util.Random;

public class Customer { // Customer class represents a customer with a name and discount percentage

	// Instance variable to store the customer's name
	String name;

	// Instance variable to store the discount percentage for the customer
	double discountPercent;

	// Constructor to initialize the customer with a name and no discount initially
	public Customer(String name) {
		this.name = name;
		this.discountPercent = 0.0; // No discount by default
	}

	// Method to randomly assign a coupon to the customer
	public void assignCoupon() {
		Random rand = new Random(); // Creating an instance of Random to generate random values
		System.out.println("Random Coupon Generator");

		int chance = rand.nextInt(100); // generates a number between 0 and 99

		if (chance < 50) { // 50% chance to receive a coupon
			// Random discount between 10% to 20%
			this.discountPercent = 10 + rand.nextInt(11);
			// Displaying the discount message
			System.out.println(
					"Congratulations " + name + "! You've received a " + discountPercent + "% discount coupon!");
		} else {
			// If no coupon is given, print a message
			System.out.println("Hi " + name + ", no coupon this time. Better luck next time!");
		}
	}

	// Getter for the customer name
	public String getName() {
		return name;
	}

	// Getter for the coupon value (discount percentage)
	public double getDiscountPercent() {
		return discountPercent;
	}
}
