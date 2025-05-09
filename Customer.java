package test;

import java.util.ArrayList;
import java.util.Random;

public class Customer {
    String name;
    int table_num;

    public Customer(String name) {
        this.name = name;
    }

    public void assignTable(ArrayList<Integer> assignedTables) {
        Random rand = new Random();
        int newTable;
        do {
            newTable = 1 + rand.nextInt(15);  // Table numbers from 1 to 15
        } while (assignedTables.contains(newTable));
        this.table_num = newTable;
        assignedTables.add(newTable);
        System.out.println("Hello " + name + "! You are assigned table number: " + table_num);
    }

    public int getTableNum() {
        return table_num;
    }
}
