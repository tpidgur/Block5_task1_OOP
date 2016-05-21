import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * provides testing of basic operations: add/subtract 1 hour/1 minute/1 second
 * @author Pidhurska Tetiana
 * @version 1 (created on 21.05.16)
 */
public class ModelTest {
    /**
     * The {@code Model}  represents the instance of the mentioned class
     * The {@code ACCURACY}  sets the tolerance in the following methods, like assertEquals (expected,actual, ACCURACY);
     */
    private static Model model;
    public static final double ACCURACY = 1e-10;
    /**
     * initializes instance of the class Model and sets the initial value
     */
    @BeforeClass
    public static void runT() {
        model = new Model(12,12,12);

    }
    /**
     * tests the  increaseOneHour() method in Model class
     */
    @Test
    public void testIncreaseOneHour()  {
        model.increaseOneHour();
        int res = model.getLocalTime().getHour();
        assertEquals(13, res, ACCURACY);
    }
    /**
     * tests the  decreaseOneHour() method in Model class
     */
    @Test
    public void testDecreaseOneHour() {
        model.decreaseOneHour();
        int res = model.getLocalTime().getHour();
        assertEquals(12, res, ACCURACY);
    }
    /**
     * tests the  increaseOneMinute() method in Model class
     */
    @Test
    public void testIncreaseOneMinute()  {
        model.increaseOneMinute();
        int res = model.getLocalTime().getMinute();
        assertEquals(13, res, ACCURACY);
    }
    /**
     * tests the  decreaseOneMinute() method in Model class
     */
    @Test
    public void testDecreaseOneMinute()  {
        model.decreaseOneMinute();
        int res = model.getLocalTime().getMinute();
        assertEquals(12, res, ACCURACY);
    }
    /**
     * tests the  increaseOneSecond() method in Model class
     */
    @Test
    public void testIncreaseOneSecond()  {
        model.increaseOneSecond();
        int res = model.getLocalTime().getSecond();
        assertEquals(13, res, ACCURACY);
    }
    /**
     * tests the  decreaseOneSecond() method in Model class
     */
    @Test
    public void testDecreaseOneSecond()  {
        model.decreaseOneSecond();
        int res = model.getLocalTime().getSecond();
        assertEquals(12, res, ACCURACY);
    }

}