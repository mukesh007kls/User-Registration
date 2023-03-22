public class UserRegistration {
    private static final String FIRST_NAME_REGEX="^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_REGEX=FIRST_NAME_REGEX;
    private static final String EMAIL_ID_REGEX="^\\w+[._+-]?\\w+@\\D+[.]+[a-z]{2,3}[.]?[a-z]{0,3}$";
    private static final String PHONE_NUMBER_REGEX="^[0-9]{1,3}[ ][0-9]{10}$";
    private static final String PASSWORD_REGEX_ONE="^\\D{8,}$";
    private static final String PASSWORD_REGEX_TWO="^(?=.*[A-Z])\\D{7,}$";
    private static final String PASSWORD_REGEX_THREE="^(?=.*[A-Z])(?=.*\\d)\\w{6,}$";
    private static final String PASSWORD_REGEX_FOUR="^(?=.*[!@#$%])(?=.*[A-Z])(?=.*\\d)(?=.*[a-z]).{8,30}$";

    public boolean firstName(String firstName){
        return firstName.matches(FIRST_NAME_REGEX);
    }

    public boolean lastName(String lastName){
        return lastName.matches(LAST_NAME_REGEX);
    }

    public boolean email(String emailID) {
        return emailID.matches(EMAIL_ID_REGEX);
    }

    public boolean phoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public boolean passwordRule1(String password){
        return password.matches(PASSWORD_REGEX_ONE);
    }

    public boolean passwordRule2(String password){
        return password.matches(PASSWORD_REGEX_TWO);
    }

    public boolean passwordRule3(String password){
        return  password.matches(PASSWORD_REGEX_THREE);
    }

    public boolean passwordRule4(String password){
        return  password.matches(PASSWORD_REGEX_FOUR);
    }
}
