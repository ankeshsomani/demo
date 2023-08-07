package gen;

public class BookAppointmentPage {

    CustomerRegistration customerRegistration = new CustomerRegistration();

    public void getCustomerDetailsInBookAppointmentPage(){

        System.out.println(customerRegistration.customerDetails.get("customerDetails").getLastname());
    }
}
