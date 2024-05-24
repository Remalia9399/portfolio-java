package selenium_webdriver.seleniumproject.pop;

public class FormData {
    private String firstName;
    private String lastName;
    private String password;
    private boolean isMr;
    private boolean signUpNewsletter;
    private boolean signUpSpecialOffers;

    public String getFirstName() {
        return firstName;
    }

    public FormData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public FormData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FormData setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean getIsMr() {
        return isMr;
    }

    public FormData setIsMr(boolean mr) {
        isMr = mr;
        return this;
    }

    public boolean getSignUpNewsletter() {
        return signUpNewsletter;
    }

    public FormData setSignUpNewsletter(boolean signUpNewsletter) {
        this.signUpNewsletter = signUpNewsletter;
        return this;
    }

    public boolean getSignUpSpecialOffers() {
        return signUpSpecialOffers;
    }

    public FormData setSignUpSpecialOffers(boolean signUpSpecialOffers) {
        this.signUpSpecialOffers = signUpSpecialOffers;
        return this;
    }
}
