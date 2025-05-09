package test;
import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> burgersVeg = new ArrayList<>();
    ArrayList<MenuItem> burgersNonVeg = new ArrayList<>();
    ArrayList<MenuItem> fries = new ArrayList<>();
    ArrayList<MenuItem> sidesVeg = new ArrayList<>();
    ArrayList<MenuItem> sidesNonVeg = new ArrayList<>();
    ArrayList<MenuItem> drinks = new ArrayList<>();
    ArrayList<MenuItem> desserts = new ArrayList<>();

    public Menu() {
        // Populate all categories
        burgersVeg.add(new MenuItem(1, "Classic Veg Burger", 150));
        burgersVeg.add(new MenuItem(2, "Bean Burger", 200));
        burgersVeg.add(new MenuItem(3, "Mushroom Burger", 250));
        burgersVeg.add(new MenuItem(4, "Quinoa Veg Burger", 300));
        burgersVeg.add(new MenuItem(5, "Lentil Burger", 250));

        burgersNonVeg.add(new MenuItem(1, "Classic Chicken Burger", 250));
        burgersNonVeg.add(new MenuItem(2, "Chicken Tikka Burger", 300));
        burgersNonVeg.add(new MenuItem(3, "Grilled Chicken Burger", 350));
        burgersNonVeg.add(new MenuItem(4, "Chicken & Bacon Burger", 450));
        burgersNonVeg.add(new MenuItem(5, "Chicken Shawarma Burger", 400));

        fries.add(new MenuItem(1, "Classic French Fries", 100));
        fries.add(new MenuItem(2, "Loaded Fries", 200));
        fries.add(new MenuItem(3, "Peri-Peri Fries", 200));
        fries.add(new MenuItem(4, "Garlic Fries", 150));
        fries.add(new MenuItem(5, "Curly Fries", 180));

        sidesVeg.add(new MenuItem(1, "Onion Rings", 180));
        sidesVeg.add(new MenuItem(2, "Veg Nuggets", 200));
        sidesVeg.add(new MenuItem(3, "Mozzarella Sticks", 250));
        sidesVeg.add(new MenuItem(4, "Corn & Cheese Balls", 200));
        sidesVeg.add(new MenuItem(5, "Mac & Cheese Bites", 250));

        sidesNonVeg.add(new MenuItem(1, "Chicken Nuggets", 200));
        sidesNonVeg.add(new MenuItem(2, "Chicken Wings", 350));

        drinks.add(new MenuItem(1, "Coke", 100));
        drinks.add(new MenuItem(2, "Sprite", 100));
        drinks.add(new MenuItem(3, "Fanta", 100));
        drinks.add(new MenuItem(4, "Lemonade", 100));
        drinks.add(new MenuItem(5, "Lime Soda", 100));

        desserts.add(new MenuItem(1, "Chocolate Brownie", 120));
        desserts.add(new MenuItem(2, "Chocolate Lava Cake", 150));
        desserts.add(new MenuItem(3, "Donuts", 100));
        desserts.add(new MenuItem(4, "Hot Fudge Sundae", 120));
        desserts.add(new MenuItem(5, "McFlurry (Oreo/Choco)", 150));
    }

    public void display(ArrayList<MenuItem> items, String title) {
        System.out.println("------------ " + title + " ------------");
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
}
