package test;
public class OrderItem {
     MenuItem item;
     int quantity;
    public OrderItem(){
       MenuItem item;
        int quantity;
    }

    public OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
   

    public  double getTotalPrice() {
        return item.price * quantity;
    }

    public String toString() {
        return item.name + " x " + quantity + " = ₹" + getTotalPrice();
    }
}
