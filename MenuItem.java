package test;
import java.util.*;
public class MenuItem {
    int number;
    String name;
    double price;

    public MenuItem(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return number + ". " + name + " - ₹" + price;
    }
}

