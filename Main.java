package test;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> assignedTables = new ArrayList<>();

        // Customer setup
        System.out.print("Enter your name: ");
        String custName = sc.nextLine();
        System.out.println();
        Customer customer = new Customer(custName);
        customer.assignTable(assignedTables);

        Menu menu = new Menu();
        Order order = new Order();
        Bill bill = new Bill(order, customer);
        
        System.out.println();
        System.out.println("-------- Welcome to McDonald's --------");
        boolean ordering = true;

        while (ordering) {
            System.out.println("\nMenu:");
            System.out.println("1. Burgers\n2. Fries\n3. Sides\n4. Drinks\n5. Desserts\n6. Proceed to Check-Out");
            System.out.println();
            System.out.print("What would you like to have? ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Veg\n2. Non Veg");
                    int burgerType = sc.nextInt();
                    if (burgerType == 1) {
                        menu.display(menu.burgersVeg, "Burgers (Veg)");
                        order.addToCart(menu.burgersVeg);
                    } else {
                        menu.display(menu.burgersNonVeg, "Burgers (Non-Veg)");
                        order.addToCart(menu.burgersNonVeg);
                    }
                    break;

                case 2:
                    menu.display(menu.fries, "Fries");
                    order.addToCart(menu.fries);
                    break;

                case 3:
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
                    menu.display(menu.drinks, "Drinks");
                    order.addToCart(menu.drinks);
                    break;

                case 5:
                    menu.display(menu.desserts, "Desserts");
                    order.addToCart(menu.desserts);
                    break;

                case 6:
                    if (order.getItems() == 0) {
                        System.out.println("\n----- Your Cart -----");
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("\nProceeding to checkout...");
                        ordering = false;
                        bill.billing();
                    }
                    break;
            }

            if (ordering) {
                System.out.println("\nWould you like to:\n1. Continue Ordering\n2. View Cart\n3. Proceed to Checkout");
                int input = sc.nextInt();
                if (input == 1) continue;
                if (input == 2) order.viewCart();
                if (input == 3) {
                    if (order.getItems() == 0) {
                        System.out.println("Cart is empty. Cannot proceed to checkout.");
                    } else {
                        ordering = false;
                        bill.billing();
                    }
                }
            }
        }
    }
}
