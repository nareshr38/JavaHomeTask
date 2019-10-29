package hometasktest_6;
import com.ranguht.code.javabasics.hometask_6.LinearIn;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class LinearInTest {
    private static final Logger logger = LogManager.getLogger(LinearInTest.class.getName());
    LinearIn linearInObj = new LinearIn();

    @Test
    public void test1() {
        int[] outerLinearInData = {1, 2, 4, 6};
        int[] InnerLinearInData = {2, 3, 4};
        boolean expectedResult = false;
        boolean actualResult = linearInObj.twoArrayCompare(outerLinearInData, InnerLinearInData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        int[] outerLinearInData = {1, 2, 4, 6};
        int[] InnerLinearInData = {2, 4};
        boolean expectedResult = true;
        boolean actualResult = linearInObj.twoArrayCompare(outerLinearInData, InnerLinearInData);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }
}
