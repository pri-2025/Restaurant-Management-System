package test;

class OnlinePayment extends Payment {
    public OnlinePayment(double amount) {
        super(amount);
    }

    public void processPayment(double discountPercent) {
        double finalAmount = applyDiscount(discountPercent);
        double taxamt= finalAmount + (0.18 * finalAmount);
        System.out.println("Online payment of: " + taxamt + " after " + discountPercent + "% discount.");
       
    }
}
