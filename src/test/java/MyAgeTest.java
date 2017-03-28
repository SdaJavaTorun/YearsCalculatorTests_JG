import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by RENT on 2017-03-26.
 */
public class MyAgeTest {

    @Test
    public void myAgeTest(){
    int mAge = AgeCalculator.calculateAge("1992-01-28","2017-03-26");
    Assert.assertEquals(25, mAge);
    }
    @Test
    public void kubaAgeTest(){
        int myAge = AgeCalculator.calculateAge("1985-08-10","2017-08-09");
        Assert.assertEquals(31,myAge);
    }
}
