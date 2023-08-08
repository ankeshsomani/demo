package gen;

import java.nio.charset.Charset;
import java.util.Random;

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

        String random = getRandomString();

        setFirstname("Padro"+random);
        setLastname("Ponny"+random);

    /*    setFirstname("Padro");
        setLastname("Ponny");*/
    }

    public String getRandomString(){

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
