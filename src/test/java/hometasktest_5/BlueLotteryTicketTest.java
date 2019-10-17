package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.BlueLotteryTicket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlueLotteryTicketTest {
    private static final Logger logger = LogManager.getLogger(BlueLotteryTicketTest.class.getName());

    @Test
    public void test1() {
        int expectedResult = 10;
        int actualResult = BlueLotteryTicket.blueTicket(9, 1, 10);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);

    }

    @Test
    public void test2() {
        int expectedResult = 0;
        int actualResult = BlueLotteryTicket.blueTicket(9, 2, 0);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }

    @Test
    public void test3() {
        int expectedResult = 5;
        int actualResult = BlueLotteryTicket.blueTicket(15, 0, 5);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test3 actual result:" + actualResult);
        logger.info("test3 expected result:" + expectedResult);
    }

}
