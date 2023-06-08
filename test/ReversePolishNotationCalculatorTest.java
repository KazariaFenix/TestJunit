import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator rpn;

    @BeforeEach
    public void shouldCreateReversePolishNotationCalculator() {
        rpn = new ReversePolishNotationCalculator();
    }


    @Test
    public void shouldCalculateAddition() {
        int result = rpn.calculatePolishNotation("56 34 +");
        int expectedSum = 90;
        Assertions.assertEquals(expectedSum, result, "Sums is NOT equals");
    }

    @Test
    public void shouldCalculateMultiply() {
        int result = rpn.calculatePolishNotation("56 34 *");
        int expectedSum = 1904;
        Assertions.assertEquals(expectedSum, result, "Multiplys is NOT equals");
    }

    @Test
    public void shouldCalculateSubtract() {
        int result = rpn.calculatePolishNotation("56 34 -");
        int expectedSum = 22;
        Assertions.assertEquals(expectedSum, result, "Subtracts is NOT equals");
    }

    @Test
    public void shouldCalculateManySpace() {
        int result = rpn.calculatePolishNotation("56        34                   +");
        int expectedSum = 90;
        Assertions.assertEquals(expectedSum, result, "Sums is NOT equals");
    }

    @Test
    public void shouldCalculateNegativeNumbers() {
        int result = rpn.calculatePolishNotation("-56 -34 +");
        int expectedSum = -90;
        Assertions.assertEquals(expectedSum, result, "Sums is NOT equals");
    }
}