package hometasktest_5;
import com.ranguht.code.javabasics.hometask5.ShareDigit;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class ShareDigitTest {
    private static final Logger logger = LogManager.getLogger(ShareDigitTest.class.getName());
    ShareDigit shareDigitObj=new ShareDigit();

    @Test
    public void test1() {
        boolean expectedResult = true;
        boolean actualResult = shareDigitObj.digit(12, 23);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        boolean expectedResult = false;
        boolean actualResult = shareDigitObj.digit(12, 43);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
