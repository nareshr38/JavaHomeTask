package oopstests;


import com.ranguht.code.javabasics.oopstask1.ApplicationUtility;
import com.ranguht.code.javabasics.oopstask1.Bouquet;
import com.ranguht.code.javabasics.oopstask1.Lilly;
import com.ranguht.code.javabasics.oopstask1.Rose;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BouquetTest {
    @Test
    public void firstTest() {
        Bouquet bouquet = new Bouquet();
        bouquet.add(new Lilly());
        bouquet.add(new Lilly());
        bouquet.add(new Lilly());
        bouquet.add(new Rose());
        bouquet.add(new Rose());
        bouquet.add(new Rose());

        int expected = 90;
        int actual = ApplicationUtility.calculateCostOfBouquet(bouquet);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void secondTest() {
        Bouquet babaBouquet = new Bouquet();
        babaBouquet.add(3, new Lilly());
        babaBouquet.add(7, new Rose());

        int expected = 130;
        int actual = ApplicationUtility.calculateCostOfBouquet(babaBouquet);
        Assert.assertEquals(expected, actual);
    }

}