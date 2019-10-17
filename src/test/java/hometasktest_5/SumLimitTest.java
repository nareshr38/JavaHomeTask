package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.SumLimit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumLimitTest {
    private static final Logger logger = LogManager.getLogger(SumLimit.class.getName());

    @Test
    public void test1() {
        int expectedResult = 5;
        int actualResult = SumLimit.sumLimitCompare(2,3);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int expectedResult = 9001;
        int actualResult = SumLimit.sumLimitCompare(9000,1);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
