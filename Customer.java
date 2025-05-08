package test;
import java.util.Random;
import java.util.Scanner;
public class Customer {
	String name;
	int table_num;
	Scanner sc = new Scanner(System.in);
	
	Customer(String name, int table_num){
		this.name = name;
		this.table_num = table_num;
	}
	
	Customer(){
		
	}
	
	Random rand = new Random();
	
	public void table() {
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		table_num = 1 + rand.nextInt(15);
		System.out.println("Hello " + name + "! You are assigned to table number: " + table_num);
	    System.out.println();
	    System.out.println();
	}
	
}
