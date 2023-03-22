import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTests {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameMatchesTheRegex() {
        try {
            boolean result = userRegistration.firstName("Mukesh");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenFirstNameDoestMatchRegex() {
        try {
            boolean result = userRegistration.firstName("mukesh");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenFirstNameHasLessThan3Char() {
        try {
            boolean result = userRegistration.firstName("Mu");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenLastNameMatchesTheRegex() {
        try {
            boolean result = userRegistration.lastName("Mallikanti");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenLastNameDoestMatchRegex() {
        try {
            boolean result = userRegistration.lastName("mallikanti");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenLastNameHasLessThan3Char() {
        try {
            boolean result = userRegistration.lastName("ma");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenEmailIdMatchesRegex() {
        try {
            boolean result = userRegistration.email("mallikanti2000@gmail.com");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenEmailIdDoesNotMatchRegex() {
        try {
            boolean result = userRegistration.email("mallikanti2000gmail.com");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPhoneNumberMatchesRegex() {
        try {
            boolean result = userRegistration.phoneNumber("1 9505850673");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPhoneNumberDoesNotMatchRegex() {
        try {
            boolean result = userRegistration.phoneNumber("9505850673");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordMatchesRegexOne() {
        try {
            boolean result = userRegistration.passwordRule1("mukhilsa");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordDoesNotMatchRegexOneLessThan8Char() {
        try {
            boolean result = userRegistration.passwordRule1("mukhikl");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordDoesNotMatchRegexOneHasUpperCase() {
        try {
            boolean result = userRegistration.passwordRule1("MUKHIkl");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordMatchesRegexTwo() {
        try {
            boolean result = userRegistration.passwordRule2("MUKHIKlsa");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordMatchesRegexTwoHasNoUpperCase() {
        try {
            boolean result = userRegistration.passwordRule2("mukhiklsa");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordMatchesRegexThree() {
        try {
            boolean result = userRegistration.passwordRule3("MUKHIklsa2921");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordDoesNotMatchRegexThreeWithoutNumber() {
        try {
            boolean result = userRegistration.passwordRule3("MUKHIklsa");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordMatchesRegexFour() {
        try {
            boolean result = userRegistration.passwordRule4("MUKHIklsa@2921");
            Assert.assertTrue(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenPasswordDoesNotMatchesRegexFourHasNoSpecialChar() {
        try {
            boolean result = userRegistration.passwordRule4("MUKHIklsa2921");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Test
    public void givenEmailIdDoesNotMatchRegexHasDomainNameLessThan3Char() {
        try {
            boolean result = userRegistration.email("mallikanti.2000@g1.com");
            Assert.assertFalse(result);
        } catch (UserException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
