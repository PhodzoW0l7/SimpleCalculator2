import com.calculator.Calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testTwoIntegers(){
        Calculator calculator = new Calculator();
        assertEquals(15,calculator.add(1,2,3,4,5));
        assertEquals(3, calculator.add(1,2));
        assertEquals(-2,calculator.add(-1,-1));
    }
    @Test
    public void testMultiplyTwoIntegers(){
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.multiply(1,3));
        assertEquals(-3,calculator.multiply(-1,3));
        assertEquals(120,calculator.multiply(1, 2, 3, 4, 5));
    }
    @Test
    public void testDivisionToIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(10, 5));
        assertEquals(20, calculator.division(40, 2));
        assertEquals(0, calculator.division(5, 10));
    }
    @Test
    public void testSubtractionTwoIntegers(){
        Calculator calculator = new Calculator();
        assertEquals(12,calculator.subtraction(14,2));
        assertEquals(5,calculator.subtraction(10,5));
        assertEquals(100,calculator.subtraction(130,30));
    }
}
