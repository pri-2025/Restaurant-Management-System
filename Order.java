package test;

import java.util.ArrayList;

import java.util.Scanner;

public class Order { // Class representing a customer's order
	ArrayList<OrderItem> cart = new ArrayList<>(); // List to store items added to the cart
	double TotalPrice; // Total price of the order
	String couponCode; // Coupon code (if any)
	double discountPercent; // Discount percentage from coupon

	// Method to add an item to the cart
	public void addToCart(ArrayList<MenuItem> items) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.print("\nEnter the item number: ");
		int itemNumber = sc.nextInt();
		sc.nextLine();

		// Search for the item number in the given menu
		for (MenuItem item : items) {
			if (item.number == itemNumber) {
				flag = 1;
				// Prompt for quantity and validate it
				while (true) {
					System.out.print("Enter quantity: ");
					int quantity = sc.nextInt();
					sc.nextLine();

					if (quantity > 0) {
						boolean found = false;

						// Check if the item is already in the cart and update quantity
						for (OrderItem orderItem : cart) {
							if (orderItem.getItem().name.equals(item.name)) {
								orderItem.increaseQuantity(quantity);
								System.out.println("Updated in cart: " + item.name + " x " + orderItem.getQuantity());
								found = true;
							}
						}

						// If item not found in cart, add it
						if (!found) {
							cart.add(new OrderItem(item, quantity));
							System.out.println("Added to cart: " + item.name + " x " + quantity);
						}
						break;
					} else {
						System.out.println("Invalid quantity!");
					}
				}
			}
		}

		// If item number was not found in the menu
		if (flag == 0) {
			System.out.println("Invalid item number");
		}
	}

	// Method to display the cart contents
	public void viewCart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----- Your Cart -----");
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			int index = 1;
			for (OrderItem item : cart) {
				System.out.println(index + "." + item);
				index++;
			}

			// Calculate total price
			TotalPrice = 0;
			for (OrderItem item : cart) {
				TotalPrice += item.getTotalPrice();
			}
			System.out.println("Total Amount: ₹" + TotalPrice);
		}

		// Option to remove or modify cart
		System.out.println("\nDo you want to remove any item?\n1.Yes\n2.No");
		int choice = sc.nextInt();
		if (choice == 1) {
			this.removeFromCart();
		}
	}

	// Method to remove or reduce quantity of an item in the cart
	public void removeFromCart() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the item number to remove or reduce quantity: ");
		int index = sc.nextInt();
		sc.nextLine();

		// Check for valid item index
		if (index < 1 || index > cart.size()) {
			System.out.println("Invalid item number.");
			return;
		}

		// Get selected item
		OrderItem selectedItem = cart.get(index - 1);

		// Options for removal or quantity reduction
		System.out.println("1. Remove item completely");
		System.out.println("2. Reduce quantity");
		System.out.print("Choose an option: ");
		int option = sc.nextInt();
		sc.nextLine();

		switch (option) {
		case 1:
			cart.remove(index - 1);
			System.out.println("'" + selectedItem.getItem().name + "' has been removed from your cart.");
			break;
		case 2:
			System.out.print("Enter quantity to reduce: ");
			int reduceQty = sc.nextInt();
			sc.nextLine();
			if (reduceQty <= 0) {
				System.out.println("Invalid quantity.");
				return;
			}
			int currentQty = selectedItem.getQuantity();
			if (reduceQty >= currentQty) {
				cart.remove(index - 1);
				System.out.println("'" + selectedItem.getItem().name + "' removed as quantity reduced to zero.");
			} else {
				selectedItem.decreaseQuantity(reduceQty);
				cart.set(index - 1, selectedItem); // Update cart
				System.out.println(
						"Reduced quantity of '" + selectedItem.getItem().name + "' to " + selectedItem.getQuantity());
			}
			break;
		default:
			System.out.println("Invalid option.");
		}
	}

	// Method to calculate and return total price
	public double getPrice() {
		TotalPrice = 0;
		for (OrderItem item : cart) {
			TotalPrice += item.getTotalPrice();
		}
		return TotalPrice;
	}

	// Print receipt including customer discount
	public void PrintReceipt(Customer customer) {
		System.out.println("\n-----Receipt-----");
		for (OrderItem item : cart) {
			System.out.println(item);
		}
		System.out.println("Total Amount: ₹" + this.getPrice());
		System.out.println("Discount: " + customer.getDiscountPercent() + "%");
	}

	// Print receipt without customer object (overloaded)
	public void PrintReceipt() {
		System.out.println("-----Receipt-----");
		for (OrderItem item : cart) {
			System.out.println(item);
		}
	}

	// Set the discount percentage applied through coupon
	public void setCouponDetails(double discount) {
		this.discountPercent = discount;
	}

	// Get discount percentage
	public double getDiscountPercent() {
		return discountPercent;
	}

	// Get total number of distinct items in cart
	public int getItems() {
		return cart.size();
	}
}
