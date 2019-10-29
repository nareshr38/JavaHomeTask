package hometasktest_6;
import com.ranguht.code.javabasics.hometask_6.MaxSpan;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class MaxSpanTest {
    private static final Logger logger = LogManager.getLogger(MaxSpanTest.class.getName());
    MaxSpan maxSpanObj=new MaxSpan();

    @Test
    public void test1() {
        int[] maxSpanData = {1, 4, 2, 1, 4, 1, 4};
        int expectedResult = 6;
        int actualResult = maxSpanObj.noOfElementsInSpan(maxSpanData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int[] maxSpanData = {1, 2, 1, 1, 3};
        int expectedResult = 4;
        int actualResult = maxSpanObj.noOfElementsInSpan(maxSpanData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
