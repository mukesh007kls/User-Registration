import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_REGEX = FIRST_NAME_REGEX;
    private static final String EMAIL_ID_REGEX = "^\\w+[._+-]?\\w+@\\w{3,}+[.]+[a-z]{2,3}[.]?[a-z]{0,3}$";
    private static final String PHONE_NUMBER_REGEX = "^[0-9]{1,3}[ ][0-9]{10}$";
    private static final String PASSWORD_REGEX_ONE = "^\\D{8,}$";
    private static final String PASSWORD_REGEX_TWO = "^(?=.*[A-Z])\\D{7,}$";
    private static final String PASSWORD_REGEX_THREE = "^(?=.*[A-Z])(?=.*\\d)\\w{6,}$";
    private static final String PASSWORD_REGEX_FOUR = "^(?=.*[!@#$%])(?=.*[A-Z])(?=.*\\d)(?=.*[a-z]).{8,30}$";

    public boolean firstName(String firstName) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(FIRST_NAME_REGEX).matcher(p).matches();
            return stringPredicate.test(firstName);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean lastName(String lastName) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(LAST_NAME_REGEX).matcher(p).matches();
            return stringPredicate.test(lastName);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean email(String emailID) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(EMAIL_ID_REGEX).matcher(p).matches();
            return stringPredicate.test(emailID);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean phoneNumber(String phoneNumber) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(PHONE_NUMBER_REGEX).matcher(p).matches();
            return stringPredicate.test(phoneNumber);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean passwordRule1(String password) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(PASSWORD_REGEX_ONE).matcher(p).matches();
            return stringPredicate.test(password);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean passwordRule2(String password) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(PASSWORD_REGEX_TWO).matcher(p).matches();
            return stringPredicate.test(password);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean passwordRule3(String password) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(PASSWORD_REGEX_THREE).matcher(p).matches();
            return stringPredicate.test(password);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }

    public boolean passwordRule4(String password) throws UserException {
        try {
            Predicate<String> stringPredicate = p -> Pattern.compile(PASSWORD_REGEX_FOUR).matcher(p).matches();
            return stringPredicate.test(password);
        } catch (NullPointerException exception) {
            throw new UserException(UserException.UserExceptionType.Null, "Invalid input");
        }
    }
}
