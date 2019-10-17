package designpatterns.strategy;

import com.ranguht.code.javabasics.designpatterns.strategy.CardValidator;
import com.ranguht.code.javabasics.designpatterns.strategy.CreditCard;
import com.ranguht.code.javabasics.designpatterns.strategy.MCValidator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreditCardTests {
    @DataProvider(name = "testdataForCardsTests")
    public Object[][] testdataForCardsTests() {
        return new Object[][]{
                {new CreditCard("MC-123456"), new MCValidator(), true}
//                {new CreditCard("VI-123456"),new MCValidator(), true}
//                {new Creditcard("123456_AM"), new AmexValidator(), true},
//                {new Creditcard("123456"),new AmexValidator() ,false},
//                {new Creditcard("123_BA_456"),new BABAValidator() ,true},
//                {new Creditcard("123_SAI_456"),new BABAValidator() ,false}
        };
    }

    @Test(dataProvider = "testdataForCardsTests")
    public void lengthOfStringTests(CreditCard card, CardValidator validator, boolean isValid) {
        boolean actualResult = card.isValid(validator);
        Assert.assertEquals(actualResult, isValid,
                card.getNumber() + "is expected to be "
                        + isValid + " However, actual result is " + actualResult);
    }

}