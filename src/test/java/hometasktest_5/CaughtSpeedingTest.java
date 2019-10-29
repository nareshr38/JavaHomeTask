package hometasktest_5;
import com.ranguht.code.javabasics.hometask5.CaughtSpeeding;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class CaughtSpeedingTest {
    private static final Logger logger = LogManager.getLogger(CaughtSpeedingTest.class.getName());
    CaughtSpeeding caughtSpeedingObj= new CaughtSpeeding();

    @Test
    public void test1() {
        int expectedResult = 0;
        int actualResult = caughtSpeedingObj.speed(60, false);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int expectedResult = 1;
        int actualResult = caughtSpeedingObj.speed(80, false);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2  expected result:" + expectedResult);
    }

    @Test
    public void test3() {
        int expectedResult = 2;
        int actualResult = caughtSpeedingObj.speed(85, false);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test3 result:" + actualResult);
        logger.info("test3 result:" + expectedResult);
    }
}
