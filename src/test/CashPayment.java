package test;

public class CashPayment extends Payment { // CashPayment class extends the abstract Payment class and provides
											// implementation for cash-based payment
	public CashPayment(double amount) {
		super(amount); // Constructor that passes the payment amount to the parent Payment class
	}

	@Override
	public void processPayment(double discountPercent) {
		double discountedAmount = applyDiscount(discountPercent); // Apply discount to the amount if applicable
		double finalAmount = discountedAmount + (0.18 * discountedAmount); // Calculate final amount by adding 18% tax

		// Display billing and payment details
		System.out.println("Tax:18%");
		System.out.println("Cash payment of: ₹" + finalAmount);
		System.out.println("Please proceed towards the counter to pay.");
	}
}