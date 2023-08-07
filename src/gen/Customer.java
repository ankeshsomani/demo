package gen;

public class Customer {

    private String lastname;
    private String firstname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public void setCustomerDetails(){

        setFirstname("Padro");
        setLastname("Ponny");
    }
}
