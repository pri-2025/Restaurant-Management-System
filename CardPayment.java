package test;

public class CardPayment extends Payment { // CardPayment class extends the abstract Payment class and provides
											// implementation for card-based payment
	public CardPayment(double amount) {
		super(amount); // Constructor that passes the payment amount to the parent Payment class
	}

	@Override
	public void processPayment(double discountPercent) {
		double discountedAmount = applyDiscount(discountPercent); // Apply discount to the amount if applicable
		double finalAmount = discountedAmount + (0.18 * discountedAmount); // Calculate final amount by adding 18% tax

		// Display billing and payment details
		System.out.println("Tax:18%");
		System.out.println("Card payment of: ₹" + finalAmount);
		System.out.println("Please insert the card");
		System.out.println("Your transaction is being processed");
		System.out.println("Please collect the receipt..");
	}
}
