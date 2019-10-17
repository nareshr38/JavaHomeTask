package hometasktest_6;

import com.ranguht.code.javabasics.hometask_6.MaxMirror;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxMirrorTest {
    private static final Logger logger = LogManager.getLogger(MaxMirrorTest.class.getName());

    @Test
    public void test1() {
        int[] maxMirrorData = {1, 2, 3, 8, 9, 3, 2, 1};
        int expectedResult = 3;
        int actualResult = MaxMirror.elementInReverse(maxMirrorData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int[] maxMirrorData = {7, 1, 2, 9, 7, 2, 1};
        int expectedResult = 2;
        int actualResult = MaxMirror.elementInReverse(maxMirrorData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
