package hometasktest_6;

import com.ranguht.code.javabasics.hometask_6.CanBalance;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class CanBalanceTest {
    private static final Logger logger = LogManager.getLogger(CanBalanceTest.class.getName());
    CanBalance canBalanceobj=new CanBalance();

    @Test
    public void test1() {

        int[] canBalanceData = {1, 1, 1, 2, 1};
        boolean expectedResult = true;
        boolean actualResult = canBalanceobj.calculateAfterSplit(canBalanceData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int[] canBalanceData = {2, 1, 1, 2, 1};
        boolean expectedResult = false;
        boolean actualResult = canBalanceobj.calculateAfterSplit(canBalanceData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
