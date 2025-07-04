package test;

public class OnlinePayment extends Payment { // OnlinePayment class extends the abstract Payment class and provides
												// implementation for online-based payment
	public OnlinePayment(double amount) {
		super(amount); // Constructor that passes the payment amount to the parent Payment class
	}

	@Override
	public void processPayment(double discountPercent) {
		double discountedAmount = applyDiscount(discountPercent); // Apply discount to the amount if applicable
		double finalAmount = discountedAmount + (0.18 * discountedAmount); // Calculate final amount by adding 18% tax

		// Display billing and payment details for online payment
		System.out.println("Tax:18%");
		System.out.println("Online payment of: ₹" + finalAmount);
		System.out.println("Please scan the QR code to pay");
		System.out.println("Please collect the receipt.");
	}
}