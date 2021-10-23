package contacts;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {


    private String name;
    private String surname;
    private String number;

    public Person() {

    }

    public Person(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = validatedNumber(number);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }


    private String validatedNumber(String phoneNumber) {

        Pattern pattern = Pattern.compile("\\+0 \\(123\\) 456-789-ABcd", Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("\\(123\\) 234 345-456", Pattern.CASE_INSENSITIVE);

//        phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}");
         Matcher matcher = pattern.matcher(phoneNumber);
         Matcher matcher1 = pattern1.matcher(phoneNumber);
        if (matcher.matches() || matcher1.matches()) {
            return phoneNumber;
        } else{
            System.out.println("Wrong number format!");
        }
        return "[no number]";

    }


    public boolean hasNumber() {

        return false;
    }

}
