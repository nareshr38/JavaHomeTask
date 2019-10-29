package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.MaxBlock;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class MaxBlockTest {
    private static final Logger lOGGER = LogManager.getLogger(MaxBlockTest.class.getName());
    MaxBlock maxBlockObj= new MaxBlock();

    @Test
    public void test1() {
        int expectedResult = 0;
        int actualResult = maxBlockObj.maxCharInAString("");
        Assert.assertEquals(expectedResult, actualResult);
        lOGGER.info("test1 Actual Result :" + actualResult);
        lOGGER.info("test1 Expected Result :" + expectedResult);

    }

    @Test
    public void test2() {
        int expectedResult = 1;
        int actualResult = maxBlockObj.maxCharInAString("Hima");
        Assert.assertEquals(expectedResult, actualResult);
        lOGGER.info("test2 Actual Result :" + actualResult);
        lOGGER.info("test2 Expected Result :" + expectedResult);
    }

    @Test
    public void test3() {
        int expectedResult = 3;
        int actualResult = maxBlockObj.maxCharInAString("abbCCCddBBBxx");
        Assert.assertEquals(expectedResult, actualResult);
        lOGGER.info("test3 Actual Result :" + actualResult);
        lOGGER.info("test2 Expected Result :" + expectedResult);
    }
}
