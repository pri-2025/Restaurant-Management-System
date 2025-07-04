package test;

public class MenuItem { // Class representing a single item in the menu
	int number; // Item number shown in the menu
	String name; // Name of the menu item
	double price; // Price of the item

	// Constructor to initialize all fields
	public MenuItem(int number, String name, double price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	// Default constructor (used when no initial values are provided)
	public MenuItem() {
		// Default constructor
	}

	// String representation of the MenuItem, used when printing the item
	public String toString() {
		return number + ". " + name + " - ₹" + price;
	}
}
