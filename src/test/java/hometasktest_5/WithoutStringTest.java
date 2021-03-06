package hometasktest_5;

import com.ranguht.code.javabasics.hometask5.WithoutString;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class WithoutStringTest {
    private static final Logger logger = LogManager.getLogger(WithoutStringTest.class.getName());
    WithoutString withoutStringObj=new WithoutString();

    @Test
    public void test1() {
        String expectedResult = "Hello ";
        String actualResult = withoutStringObj.removeString("Hello there", "there");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test1 actual result:" + actualResult);
        logger.info("test1 expected result:" + expectedResult);
    }

    @Test
    public void test2() {
        String expectedResult = "Bye for ";
        String actualResult = withoutStringObj.removeString("Bye for strings", "Strings");
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("test2 actual result:" + actualResult);
        logger.info("test2 expected result:" + expectedResult);
    }

}
