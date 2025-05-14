package test;

import java.util.Scanner;

public class Bill {
	Order order; // Reference to the customer's order
	Customer customer; // Reference to the customer

	public Bill(Order order, Customer customer) {
		this.order = order; // Constructor assigns order and customer
		this.customer = customer;
	}

	public void billing() {
		double totalAmount = 0;

		// Calculate total amount from all items in the cart
		for (OrderItem item : order.cart) {
			totalAmount += item.getTotalPrice();
		}

		double discountPercent = customer.getDiscountPercent(); // Get discount percentage (from coupon)
		Scanner scan = new Scanner(System.in);

		if (discountPercent > 0) {
			int x;
			while (true) {
				System.out.println("Coupon: \n1.Yes 2.No");
				System.out.print("Do you want to use coupon? ");
				x = scan.nextInt();
				scan.nextLine(); // Clear newline

				if (x == 1 || x == 2)
					break;
				else
					System.out.println("Invalid choice! Please enter 1 or 2.\n");
			}

			switch (x) {
			case 1:
				System.out.println("Coupon applied! You get " + discountPercent + "% off.");
				int y;
				boolean ordering = true;

				while (ordering) {
					System.out.println("Payment methods : \n1.Cash 2.Card 3.Online");
					System.out.print("How do you want to pay? ");
					y = scan.nextInt();
					scan.nextLine();
					System.out.println();

					if (y >= 1 && y <= 3) {
						Payment payment;
						switch (y) {
						case 1:
							payment = new CashPayment(totalAmount);
							order.PrintReceipt(customer);
							payment.processPayment(discountPercent);
							break;
						case 2:
							payment = new CardPayment(totalAmount);
							order.PrintReceipt(customer);
							payment.processPayment(discountPercent);
							break;
						case 3:
							payment = new OnlinePayment(totalAmount);
							order.PrintReceipt(customer);
							payment.processPayment(discountPercent);
							break;
						}
						ordering = false;
					} else {
						System.out.println("Invalid choice! Please enter 1, 2 or 3.\n");
					}
				}
				break;

			case 2:
				proceedWithoutCoupon(totalAmount, scan);
				break;
			}
		} else {
			System.out.println("You don't have a coupon, proceeding without discount");
			proceedWithoutCoupon(totalAmount, scan);
		}

		System.out.println("-----------------");
		System.out.println("Thank you for ordering with us, " + customer.name + "!");
	}

	// Method to handle payment without any discount
	void proceedWithoutCoupon(double totalAmount, Scanner scan) {
		int z;

		while (true) {
			System.out.println("Payment methods : \n1.Cash 2.Card 3.Online");
			System.out.print("How do you want to pay? ");
			z = scan.nextInt();
			scan.nextLine();
			System.out.println();

			if (z >= 1 && z <= 3) {
				double taxamount = totalAmount + (0.18 * totalAmount);

				order.PrintReceipt();
				System.out.println("Total Amount: ₹" + totalAmount);
				System.out.println("Tax:18%");

				switch (z) {
				case 1:
					System.out.println("Cash payment of: ₹" + taxamount);
					System.out.println("Please proceed towards the counter to pay");
					break;
				case 2:
					System.out.println("Card payment of: ₹" + taxamount);
					System.out.println("Please insert the card");
					System.out.println("Your transaction is being processed");
					System.out.println("Please collect the receipt.");
					break;
				case 3:
					System.out.println("Online payment of: ₹" + taxamount);
					System.out.println("Please scan the QR code to pay");
					System.out.println("Please collect the receipt.");
					break;
				}
				break;
			} else {
				System.out.println("Invalid choice! Please enter 1, 2 or 3.\n");
			}
		}
	}
}
