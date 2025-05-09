package test;
import java.util.*;
public class Order {
    ArrayList<OrderItem> cart = new ArrayList<>();
    double TotalPrice;
   
   public int getItems(){
       return cart.size();
   }
   
    public void addToCart(ArrayList<MenuItem> items) {
    Scanner sc = new Scanner(System.in);
    int flag=0;

    System.out.print("\nEnter the item number: ");
    int itemNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    for (MenuItem item : items) {
        if (item.number == itemNumber) {
            flag=1;
            cart.add(new OrderItem(item, quantity));
            System.out.println("Added to cart: " + item.name + " x" + quantity);
            break;
        }
    }
    if(flag==0){
        System.out.println("Invalid item number");
    }
   
}
public void viewCart() {
    System.out.println("\n----- Your Cart -----");
    if (cart.isEmpty()) {
        System.out.println("Your cart is empty.");
    }
    else {
        for (OrderItem item : cart) {
            System.out.println(item);
        }
        for (OrderItem item : cart){
            TotalPrice+=item.getTotalPrice();
        }
        System.out.println("Total Amount: "+TotalPrice );
    }
}
public void PrintReceipt(){
    System.out.println("-----Receipt-----");
    for (OrderItem item : cart) {
            System.out.println(item);
        }
}
}
