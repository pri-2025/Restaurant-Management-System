package test;

public abstract class Payment { // Abstract class Payment represents the common structure for all payment types
	double amount; // Instance variable to store the payment amount

	// Constructor to initialize the amount for the payment
	public Payment(double amount) {
		this.amount = amount;
	}

	// Getter method to retrieve the payment amount
	public double getAmount() {
		return amount;
	}

	// Method to apply the discount on the given amount
	// It calculates the new amount after applying the discount
	public double applyDiscount(double discountPercent) {
		double a = amount - (amount * discountPercent / 100);
		System.out.println("Amount after discount: ₹" + a);
		return a;
	}

	// Abstract method to process the payment based on the discount percentage
	// This method must be implemented by subclasses
	public abstract void processPayment(double discountPercent);
}
