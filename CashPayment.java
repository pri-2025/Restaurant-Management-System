package test;

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    public void processPayment(double discountPercent) {
        double finalAmount = applyDiscount(discountPercent);
        double taxamt= finalAmount + (0.18 * finalAmount);
        System.out.println("Card payment of: " + taxamt + " after " + discountPercent + "% discount.");
    }
}
