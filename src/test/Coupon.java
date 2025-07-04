package test;

public class Coupon { // Coupon class represents a discount coupon with a code and discount percentage
	String code; // Instance variable to store the coupon code
	double discountPercent; // Instance variable to store the discount percentage of the coupon

	// Constructor to initialize the coupon with a code and a discount percentage
	public Coupon(String code, double discountPercent) {
		this.code = code;
		this.discountPercent = discountPercent;
	}
}
