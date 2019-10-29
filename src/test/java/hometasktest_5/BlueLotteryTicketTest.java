package hometasktest_5;

import com.ranguht.code.javabasics.hometask_5.BlueLotteryTicket;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

public class BlueLotteryTicketTest {
    private static final Logger logger = LogManager.getLogger(BlueLotteryTicketTest.class.getName());
    BlueLotteryTicket blueLotteryTicketObj = new BlueLotteryTicket();

    @DataProvider(name = "blueLotteryTicketTestsData")
    public Object[][] testDataForBlueLotteryTicketTests() {
        return new Object[][]{
                {9,1,10,10},
                {9,2,0,0},
                {15,0,5,5}
        };
    }

    @Test(dataProvider = "blueLotteryTicketTestsData")
    public void allTests(int a,int b,int c,int expectedResult)

    {

        int actualResult = blueLotteryTicketObj.blueTicket(a, b, c);
        Assert.assertEquals(expectedResult, actualResult,"Actual and expected same");

    }


}

