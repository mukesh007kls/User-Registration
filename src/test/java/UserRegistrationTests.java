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
}
