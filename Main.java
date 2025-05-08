package test;
public class Main {
	public static void main(String[] args) {
		
		Menu M1 = new Menu();
		
		System.out.println("--------Welcome to McDonalds--------");
		System.out.println();
		System.out.println("Select your order:\n1.Burgers\n2.Fries\n3.Sides\n4.Drinks\n5.Desserts ");
		
		System.out.println();
		
		M1.Burger();
		M1.Drinks();
		M1.Fries();
		M1.Sides();
		M1.Dessert();
			
		Customer C1 = new Customer();
		C1.table();
	}
}
