import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    public static ReversePolishNotationCalculator calculator;
    private static final String EXPRESSION_FOR_ADDITION = "4  3  +";
    private static final String EXPRESSION_FOR_SUBTRACTION = "10  -7  -";
    private static final String EXPRESSION_FOR_MULTIPLICATION = "3  4  *";

    @BeforeAll
    public  static void createCalculator() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(7, calculator.calculatePolishNotation(EXPRESSION_FOR_ADDITION));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(17,calculator.calculatePolishNotation(EXPRESSION_FOR_SUBTRACTION));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(12,calculator.calculatePolishNotation(EXPRESSION_FOR_MULTIPLICATION));
    }
}
