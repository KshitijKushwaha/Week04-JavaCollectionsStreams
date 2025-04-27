import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator{
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10,calc.add( 5, 5),"Addition is correct");
    }
    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(10,calc.subtract( 15, 5),"Subtract is correct");
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(25,calc.multiply( 5, 5),"Multiplication is correct");
    }
    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.divide( 25, 5),"Divide is correct");
    }
}
