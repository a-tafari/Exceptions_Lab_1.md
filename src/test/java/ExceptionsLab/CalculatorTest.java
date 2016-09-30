package ExceptionsLab;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by abijah on 9/30/16.
 */
public class CalculatorTest {
    double delta = 0.001;

    @Test
    public void addTest(){

        double expected= 6;
        double actual = Calculator.add(5,5);
        Assert.assertEquals("should be " + expected, expected, actual, delta);
    }

    @Test
    public void subtractTest(){

        double expected= 6;
        double actual = Calculator.subtract(13,5);
        Assert.assertEquals("should be " + expected, expected, actual, delta);
    }
    @Test
    public void multiplyTest(){

        double expected= 6;
        double actual = Calculator.multiply(4,2);
        Assert.assertEquals("should be " + expected, expected, actual, delta);
    }
     @Test
    public void divideTest(){

        double expected= 5;
        double actual = Calculator.divide(5,0);
        Assert.assertEquals("should throw an exception", expected, actual, delta);
    }
    @Test
    public void divide2Test(){

        boolean answer = true;
        try {
            Calculator.divide2(4,0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        assertTrue(answer);
    }


    @Test
    public void sqreRootTest() throws madeUpException{
        int expected = 5;
        int actual = Calculator.sqrt(-1);
        Assert.assertEquals(expected,actual);
    }
}
