package hometasktest_5;

import com.ranguht.code.javabasics.hometask5.SumNumbers;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class SumNumbersTest {
    private static final Logger logger = LogManager.getLogger(SumNumbersTest.class.getName());
    SumNumbers sumNumbersObj=new SumNumbers();

    @Test
    public void test1() {
        int expectedResult = 56765;
        int actualResult = sumNumbersObj.numberFindInString("fgt56765ghg");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int expectedResult = 125;
        int actualResult = sumNumbersObj.numberFindInString("125fgtghg");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
