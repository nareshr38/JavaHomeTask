package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.TeaParty;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class TeaPartyTest {
    private static final Logger logger = LogManager.getLogger(TeaPartyTest.class.getName());
    TeaParty teaPartyObj=new TeaParty();

    @Test
    public void test1() {
        int expectedResult = 1;
        int actualResult = teaPartyObj.partyDescription(6, 8);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 expected result:" + actualResult);
        logger.info("test1 actual result:" + expectedResult);
    }

    @Test
    public void test2() {
        int expectedResult = 0;
        int actualResult = teaPartyObj.partyDescription(3, 8);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 expected result:" + actualResult);
        logger.info("test2 actual result:" + expectedResult);
    }

    @Test
    public void test3() {
        int expectedResult = 2;
        int actualResult = teaPartyObj.partyDescription(20, 6);
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 expected result:" + actualResult);
        logger.info("test2 actual result:" + expectedResult);
    }
}
