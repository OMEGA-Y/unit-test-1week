import junit.framework.TestCase;
import org.junit.Test;

public class CustomCalculatorTest extends TestCase {

    private CustomCalculator customCalculator;

    @Test
    public void testAdd(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        assertTrue(result == 20);
    }

    @Test
    public void testSubtract(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,2);
        assertTrue(result == 8);
    }

    @Test
    public void testMultiply(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10,2);
        assertTrue(result == 20);
    }

    @Test
    public void testDivide(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        assertTrue(result == 5);
    }
}