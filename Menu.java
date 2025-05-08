package test;
import java.util.*;

public class Menu {

    String name;
    double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    Menu(){
    	
    }

    public String toString() {
        return name + getSpaces(name) + "₹" + price;
    }

    private String getSpaces(String name) {
        int totalLength = 40;
        int spacesToAdd = totalLength - name.length();
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < spacesToAdd; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }

    List<Menu> Burgers_Veg = new ArrayList<>();
    List<Menu> Burgers_NonVeg = new ArrayList<>();
    List<Menu> Fries = new ArrayList<>();
    List<Menu> Sides_Veg = new ArrayList<>();
    List<Menu> Sides_NonVeg = new ArrayList<>();
    List<Menu> Drinks = new ArrayList<>();
    List<Menu> Desserts = new ArrayList<>();

    public void Burger() {
        System.out.println("------------------Burgers (Veg)------------------");
        Burgers_Veg.add(new Menu("1.) Classic Veg Burger", 150));
        Burgers_Veg.add(new Menu("2.) Bean Burger", 200));
        Burgers_Veg.add(new Menu("3.) Mushroom Burger", 250));
        Burgers_Veg.add(new Menu("4.) Quinoa Veg Burger", 300));
        Burgers_Veg.add(new Menu("5.) Lentil Burger", 250));

        for (Menu b_v : Burgers_Veg) {
            System.out.println(b_v);
        }
        System.out.println();
        
        System.out.println("------------------Burgers (Non-Veg)------------------");
        Burgers_NonVeg.add(new Menu("1.) Classic Chicken Burger", 250));
        Burgers_NonVeg.add(new Menu("2.) Chicken Tikka Burger", 300));
        Burgers_NonVeg.add(new Menu("3.) Grilled Chicken Burger", 350));
        Burgers_NonVeg.add(new Menu("4.) Chicken & Bacon Burger", 450));
        Burgers_NonVeg.add(new Menu("5.) Chicken Shawarma Burger", 400));

        for (Menu b_nv : Burgers_NonVeg) {
            System.out.println(b_nv);
        }
        System.out.println();
        System.out.println();
    }

    public void Fries() {
        System.out.println("--------------------Fries--------------------");
        Fries.add(new Menu("1.) Classic French Fries", 100));
        Fries.add(new Menu("2.) Loaded Fries", 200));
        Fries.add(new Menu("3.) Peri-Peri Fries", 200));
        Fries.add(new Menu("4.) Garlic Fries", 150));
        Fries.add(new Menu("5.) Curly Fries", 180));

        for (Menu f : Fries) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println();
    }

    public void Sides() {
        System.out.println("-------------------Sides (Veg)-------------------");
        Sides_Veg.add(new Menu("1.) Onion Rings", 180));
        Sides_Veg.add(new Menu("2.) Veg Nuggets", 200));
        Sides_Veg.add(new Menu("3.) Mozzarella Sticks", 250));
        Sides_Veg.add(new Menu("4.) Corn & Cheese Balls", 200));
        Sides_Veg.add(new Menu("5.) Mac & Cheese Bites", 250));

        for (Menu s_v : Sides_Veg) {
            System.out.println(s_v);
        }
        System.out.println();
        System.out.println("------------------Sides (Non-Veg)------------------");
        Sides_NonVeg.add(new Menu("1.) Chicken Nuggets", 200));
        Sides_NonVeg.add(new Menu("2.) Chicken Wings", 350));

        for (Menu s_nv : Sides_NonVeg) {
            System.out.println(s_nv);
        }
        System.out.println();
        System.out.println();
    }
    
    public void Drinks() {
        System.out.println("--------------------Drinks--------------------");
        Drinks.add(new Menu("1.) Coke", 100));
        Drinks.add(new Menu("2.) Sprite", 100));
        Drinks.add(new Menu("3.) Fanta", 100));
        Drinks.add(new Menu("4.) Lemonade", 100));
        Drinks.add(new Menu("5.) Lime Soda", 100));

        for (Menu d : Drinks) {
            System.out.println(d);
        }
        System.out.println();
        System.out.println();
    }

    public void Dessert() {
        System.out.println("--------------------Dessert--------------------");
        Desserts.add(new Menu("1.) Chocolate Brownie", 120));
        Desserts.add(new Menu("2.) Chocolate Lava Cake", 150));
        Desserts.add(new Menu("3.) Donuts", 100));
        Desserts.add(new Menu("4.) Hot Fudge Sundae", 120));
        Desserts.add(new Menu("5.) McFlurry (Oreo/Choco)", 150));

        for (Menu ds : Desserts) {
            System.out.println(ds);
        }
        System.out.println();
        System.out.println();
    }
}
