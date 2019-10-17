package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.InOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InorderTest {
    private static final Logger logger = LogManager.getLogger(InorderTest.class.getName());

    @Test
    public void test1() {
        boolean expectedResult = true;
        boolean actualResult = InOrder.Order(1, 2, 4, false);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        boolean expectedResult = false;
        boolean actualResult = InOrder.Order(1, 2, 1, false);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }

}
