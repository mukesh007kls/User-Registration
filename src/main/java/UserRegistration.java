import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_REGEX="^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_REGEX=FIRST_NAME_REGEX;
    private static final String EMAIL_ID_REGEX="^\\w+[._+-]?\\w+@\\D+[.]+[a-z]{2,3}[.]?[a-z]{0,3}$";

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        String emailid="mallikanti@gmail.com";
        System.out.println(userRegistration.email(emailid));
    }
    public boolean firstName(String firstName){
        return firstName.matches(FIRST_NAME_REGEX);
    }

    public boolean lastName(String lastName){
        return lastName.matches(LAST_NAME_REGEX);
    }

    public boolean email(String emailID) {
        return emailID.matches(EMAIL_ID_REGEX);
    }
}
