package test;
import java.util.*;
import java.util.Scanner;

public class Bill {
    Order order;
    Customer customer;

    public Bill(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }

    public void billing() {
        double totalAmount = 0;
        for (OrderItem item : order.cart) {
            totalAmount += item.getTotalPrice();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Coupon: \n1.Yes             2.No");
        System.out.print("Do you want to use coupon? ");
        int x = scan.nextInt();
        System.out.println();
        switch (x) {
            case 1:
                scan.nextLine(); // consume newline
                System.out.print("Enter the coupon code: ");
                String code = scan.nextLine();
                System.out.print("Enter the discount percent: ");
                double discountPercent = scan.nextDouble();
                Coupon coupon = new Coupon(code, discountPercent);

                System.out.println("Payment methods : \n1.Cash         2.Card           3.Online");
                System.out.print("How do you want to pay?");
                int y = scan.nextInt();
                System.out.println();
                Payment payment;
                switch (y) {
                    case 1:
                        payment = new CashPayment(totalAmount);
                        order.PrintReceipt();
                        payment.processPayment(discountPercent);
                        break;
                    case 2:
                        payment = new CardPayment(totalAmount);
                        order.PrintReceipt();
                        payment.processPayment(discountPercent);
                        break;
                    case 3:
                        payment = new OnlinePayment(totalAmount);
                        order.PrintReceipt();
                        payment.processPayment(discountPercent);
                        break;
                }
                break;

            case 2:
            	System.out.println("Payment methods : \n1.Cash         2.Card           3.Online");
                System.out.print("How do you want to pay?");
                int z = scan.nextInt();
                double taxamount = totalAmount + (0.18 * totalAmount);
                order.PrintReceipt();
                System.out.println("The final amount is: ₹" + taxamount);
                switch (z) {
                    case 1:
                        System.out.println("Please proceed towards the counter to pay");
                        break;
                    case 2:
                        System.out.println("Please insert the card");
                        System.out.println("Your transaction is being processed");
                        System.out.println("Please collect the receipt. Thank you for ordering!");
                        break;
                    case 3:
                        System.out.println("Please scan the QR code to pay");
                        System.out.println("Please collect the receipt. Thank you for ordering!");
                        break;
                }
        }

        // Final table and customer summary
        System.out.println("-----------------");
        System.out.println("Order linked to table number: " + customer.getTableNum());
        System.out.println("Thank you for dining with us, " + customer.name + "!");
    }
}
