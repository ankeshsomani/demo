package gen;

public class BookAppointmentPage {

    CustomerRegistration customerRegistration = new CustomerRegistration();

    public void getCustomerDetailsInBookAppointmentPage(){

        //how would we access the hashmap here in this class ?

        System.out.println("in BookAppointment Page : "+customerRegistration.customerDetails.get("customerDetails").getLastname());
    }
}
