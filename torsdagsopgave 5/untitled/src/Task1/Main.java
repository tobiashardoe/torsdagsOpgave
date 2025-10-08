package Task1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // task 1.e
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Tobias","Hardø","TH"));
        customers.add(new Customer("Sophia", "Philipsz", "SP"));
        printCustomers(customers);

    }

    // task 1.f
    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c: customers){
            System.out.println(c);
        }
    }
}
