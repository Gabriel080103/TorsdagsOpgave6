package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.e Create an ArrayList of customers
        ArrayList<Customer> customers = new ArrayList<>();

        // Option 1: Instantiate first, then add
        Customer c1 = new Customer("Harry", "Potter", "hpotter");
        customers.add(c1);

        // Option 2: Instantiate and add in one line
        customers.add(new Customer("Hermione", "Granger", "hgranger"));
        customers.add(new Customer("Ron", "Weasley", "rweasley"));

        // 1.f Call method to print all customers
        printCustomers(customers);
    }

    // 1.f Method to print all customers
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c); // uses the toString() method
        }
    }
}

