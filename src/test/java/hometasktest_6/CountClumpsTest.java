package hometasktest_6;

import com.ranguht.code.javabasics.hometask6.CountClumps;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class CountClumpsTest {
    private static final Logger logger = LogManager.getLogger(CountClumpsTest.class.getName());
    CountClumps countClumpsObj=new CountClumps();

    @Test
    public void test1() {
        int[] countClumpsData = {1, 2, 2, 3, 4, 4};
        int expectedResult = 2;
        int actualResult = countClumpsObj.seriesInArray(countClumpsData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int[] canBalanceData = {1, 1, 1, 1, 1};
        int expectedResult = 1;
        int actualResult = countClumpsObj.seriesInArray(canBalanceData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}

