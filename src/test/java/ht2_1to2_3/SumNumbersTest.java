package ht2_1to2_3;

import com.ranguht.code.javabasics.hT2_1to2_3.SumNumbers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SumNumbersTest {

    private static final Logger logger = LogManager.getLogger(SumNumbersTest.class.getName());

    @Test
    public void test1() {
        int expectedResult = 242314324;
//        int actualResult = SumNumbers.numberFindInString("fgt56765ghg");
        int actualResult = SumNumbers.sumNumbers("Naresh242314324asdfaq");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int expectedResult = 125;
        int actualResult = SumNumbers.sumNumbers("125fgtghg");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }


}
