import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {

    private String emailID;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public EmailTest(String emailID, boolean expectedResult) {
        this.emailID = emailID;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize(){
        userRegistration=new UserRegistration();
    }

    @Parameterized.Parameters()
    public static Collection testMailIDs(){
        return Arrays.asList(new Object[][]{
                {"mallikanti2000@gmail.com",true},
                {"mallikanti-2000@gmail.com",true},
                {"mallikanti.2000@gmail.com",true},
                {"mallikanti@gmail.com",true},
                {"mallikanti2000@gmail.com.in",true},
                {"mallikanti2000@gmail1.com.in",true},
                {"mallikanti+2000@gmail.com",true},
                {"mallikanti2000gmail.com",false},
                {"mallikanti2000@gmailcom",false},
                {"mallikanti2000@gmail",false},
                {"mallikanti2000",false},
                {"mallikanti2000@gmail.2com",false},
                {"mallikanti2000@g1.com",false}
        });
    }
    @Test
    public void givenMultipleEmailId_ShouldReturnTrueOrFalse(){
        try {
            Assert.assertEquals(expectedResult,userRegistration.email(emailID));

        }catch (UserException exception){
            System.out.println(exception.getMessage());
        }
    }

}
