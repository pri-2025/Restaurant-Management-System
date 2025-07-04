package test;

public class OrderItem { // Class representing an item in the order cart
	MenuItem item; // The menu item being ordered
	int quantity; // Quantity of the item ordered

	// Constructor to initialize the order item with the menu item and quantity
	public OrderItem(MenuItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	// Method to calculate the total price for this order item
	public double getTotalPrice() {
		return item.price * quantity;
	}

	// Override toString() to display item details in a readable format
	public String toString() {
		return item.name + " x " + quantity + " = ₹" + getTotalPrice();
	}

	// Getter method to access the MenuItem
	public MenuItem getItem() {
		return item;
	}

	// Getter method to access the quantity
	public int getQuantity() {
		return quantity;
	}

	// Method to increase the quantity of this item
	public void increaseQuantity(int qty) {
		this.quantity += qty;
	}

	// Method to decrease the quantity of this item
	public void decreaseQuantity(int qty) {
		this.quantity -= qty;
	}
}
