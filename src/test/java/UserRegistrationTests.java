import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTests {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void givenFirstNameMatchesTheRegex(){
        boolean result=userRegistration.firstName("Mukesh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameDoestMatchRegex(){
        boolean result=userRegistration.firstName("mukesh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameHasLessThan3Char(){
        boolean result=userRegistration.firstName("Mu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameMatchesTheRegex(){
        boolean result=userRegistration.lastName("Mallikanti");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameDoestMatchRegex(){
        boolean result=userRegistration.lastName("mallikanti");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHasLessThan3Char(){
        boolean result=userRegistration.lastName("ma");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailIdMatchesRegex(){
        boolean result=userRegistration.email("mallikanti2000@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailIdDoesNotMatchRegex(){
        boolean result=userRegistration.email("mallikanti2000gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberMatchesRegex(){
        boolean result=userRegistration.phoneNumber("1 9505850673");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumberDoesNotMatchRegex(){
        boolean result=userRegistration.phoneNumber("9505850673");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordMatchesRegexOne(){
        boolean result=userRegistration.passwordRule1("mukhilsa");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordDoesNotMatchRegexOneLessThan8Char(){
        boolean result=userRegistration.passwordRule1("mukhikl");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordDoesNotMatchRegexOneHasUpperCase(){
        boolean result=userRegistration.passwordRule1("MUKHIkl");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordMatchesRegexTwo(){
        boolean result=userRegistration.passwordRule2("MUKHIKlsa");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordMatchesRegexTwoHasNoUpperCase(){
        boolean result=userRegistration.passwordRule2("mukhiklsa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordMatchesRegexThree(){
        boolean result=userRegistration.passwordRule3("MUKHIklsa2921");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordDoesNotMatchRegexThreeWithoutNumber(){
        boolean result=userRegistration.passwordRule3("MUKHIklsa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordMatchesRegexFour(){
        boolean result=userRegistration.passwordRule4("MUKHIklsa@2921");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordDoesNotMatchesRegexFourHasNoSpecialChar(){
        boolean result=userRegistration.passwordRule4("MUKHIklsa2921");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailIdDoesNotMatchRegexHasDomainNameLessThan3Char(){
        boolean result=userRegistration.email("mallikanti.2000@g1.com");
        Assert.assertFalse(result);
    }
}
