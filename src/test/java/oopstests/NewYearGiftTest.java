package oopstests;


import com.ranguht.code.javabasics.oopstask2.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewYearGiftTest {
    Gift gift = new Gift();

    @Test
    public void firstTest() {


        gift.add(1, new DairyMilk());
        gift.add(1, new Laddu());
        gift.add(2, new KaajuBurfi());
        gift.add(2, new BarOne());

        int expected = 5050;
        int actual = gift.calculateGiftTotalWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SecondTest() {

        gift.add(new DairyMilk());
        gift.add(new BarOne());
        gift.add(new KaajuBurfi());
        gift.add(new Laddu());

        int expected = 2020;
        int actual = gift.calculateGiftTotalWeight();

        Assert.assertEquals(expected, actual);
    }
}