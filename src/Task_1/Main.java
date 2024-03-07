package Task_1;

import Task_1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customer = new ArrayList<>();
        Customer num1 = new Customer("Billy", "Man", "BM123");
        Customer num2 = new Customer("Bob", "Bobson", "BBboy");

        System.out.println(num1);
        System.out.println(num2);

        printCustomers(customer);
    }

    static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);

        }
    }
}