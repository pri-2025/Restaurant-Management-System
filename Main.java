package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Display welcome message
		System.out.println("-------- Welcome to Byte & Bite --------");
		System.out.println();

		String custName;

		// Prompt user to enter their name (only alphabets allowed)
		while (true) {
			System.out.print("Please enter your name: ");
			custName = sc.nextLine();
			System.out.println();

			if (custName.matches("[a-zA-Z]+")) {
				break;
			} else {
				System.out.println("Invalid input. Please enter letters only.\n");
			}
		}

		// Create customer and assign a coupon
		Customer customer = new Customer(custName);
		customer.assignCoupon();

		// Initialize menu, order, and bill objects
		Menu menu = new Menu();
		Order order = new Order();
		Bill bill = new Bill(order, customer);

		boolean ordering = true;

		// Main ordering loop
		while (ordering) {
			System.out.println("\nMenu:");
			System.out.println("1. Burgers\n2. Fries\n3. Sides\n4. Drinks\n5. Desserts\n6. Proceed to Check-Out");
			System.out.println();
			System.out.print("What would you like to have? (Enter 1 for Burgers, 2 for Fries...)");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				// Choose Veg or Non-Veg Burger
				while (true) {
					System.out.println("1. Veg\n2. Non Veg");
					int burgerType = sc.nextInt();
					if (burgerType == 1) {
						menu.display(menu.burgersVeg, "Burgers (Veg)");
						order.addToCart(menu.burgersVeg);
						break;
					} else if (burgerType == 2) {
						menu.display(menu.burgersNonVeg, "Burgers (Non-Veg)");
						order.addToCart(menu.burgersNonVeg);
						break;
					} else {
						System.out.print("Invalid choice!\n");
					}
				}
				break;

			case 2:
				// Display fries and add to cart
				menu.display(menu.fries, "Fries");
				order.addToCart(menu.fries);
				break;

			case 3:
				// Choose Veg or Non-Veg Sides
				System.out.println("1. Veg\n2. Non Veg");
				int sideType = sc.nextInt();
				if (sideType == 1) {
					menu.display(menu.sidesVeg, "Sides (Veg)");
					order.addToCart(menu.sidesVeg);
				} else {
					menu.display(menu.sidesNonVeg, "Sides (Non-Veg)");
					order.addToCart(menu.sidesNonVeg);
				}
				break;

			case 4:
				// Display drinks and add to cart
				menu.display(menu.drinks, "Drinks");
				order.addToCart(menu.drinks);
				break;

			case 5:
				// Display desserts and add to cart
				menu.display(menu.desserts, "Desserts");
				order.addToCart(menu.desserts);
				break;

			case 6:
				// Proceed to checkout if cart has items
				if (order.getItems() == 0) {
					System.out.println("\n----- Your Cart -----");
					System.out.println("Your cart is empty.");
				} else {
					System.out.println("\nProceeding to checkout...");
					ordering = false;
					bill.billing(); // Generate bill
				}
				break;

			default:
				System.out.println("Invalid choice!");
			}

			// After a selection, ask the user what to do next
			if (ordering) {
				while (true) {
					System.out.println(
							"\nWould you like to:\n1. Continue Ordering\n2. View Cart\n3. Proceed to Checkout");
					int input = sc.nextInt();
					sc.nextLine(); // Clear newline

					if (input == 1) {
						break;
					} else if (input == 2) {
						order.viewCart();
					} else if (input == 3) {
						if (order.getItems() == 0) {
							System.out.println("Cart is empty. Cannot proceed to checkout.");
						} else {
							ordering = false;
							bill.billing(); // Finalize order
							break;
						}
					} else {
						System.out.println("Invalid choice! ");
					}
				}
			}
		}
	}
}
