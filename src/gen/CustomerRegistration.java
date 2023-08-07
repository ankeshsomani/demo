package gen;

import java.util.HashMap;

public class CustomerRegistration {


    Customer customer = new Customer();

    HashMap<String,Customer> customerDetails = new HashMap<>();

    public void getCustomerDetailsInCustomerRegistration(){
        customer.setCustomerDetails(); //first setting up the new customer details

        System.out.println(customer.getFirstname());
        System.out.println(customer.getLastname());

        customerDetails.put("customerDetails",customer); // storing customer object in hash

    }
}
