package gen;

import java.util.HashMap;

public class CustomerRegistration {


//    Customer customer = new Customer();

    static HashMap<String,Customer> customerDetails = new HashMap<>();

    public void getCustomerDetailsInCustomerRegistration(){

        Customer customer = new Customer();
        customer.setCustomerDetails(); //first setting up the new customer details

        System.out.println(customer.getFirstname());
        System.out.println(customer.getLastname());

//        customerDetails.put("customerDetails",customer); // storing customer object in hash

        customerDetails.put(customer.getLastname(),customer); // storing every customer object against customer lastname(key)

    }
}
