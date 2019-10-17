package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.TrulyGreatNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrulyGreatNumberTest {
    private static final Logger logger = LogManager.getLogger(TrulyGreatNumberTest.class.getName());

    @Test
    public void test1() {
        boolean expectedResult = true;
        boolean actualResult = TrulyGreatNumber.GreatNumber(12, 6);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1  expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        boolean expectedResult = false;
        boolean actualResult = TrulyGreatNumber.GreatNumber(5, 12);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }

}
