import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by RENT on 2017-03-26.
 */
public class ExceptionsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenDayShouldNotBeLessThanBirthDay() {
       expectedException.expect(IllegalArgumentException.class);
       expectedException.expectMessage("Given Date should be later than a day of birth");
        AgeCalculator.calculateAge("2017-01-01", "2016-01-01");
    }
    @Test
    public void dateFormatShouldBeCorrect(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Wrong date format");
        AgeCalculator.calculateAge("2017-08-08","2000\04\09");
    }


   /* @Test(expected = IllegalArgumentException.class)
    public void givenDayShouldNotBeLessThanBirthDay(){
    AgeCalculator.calculateAge("2017-01-01","2016-12-31");
     }
    */


}
