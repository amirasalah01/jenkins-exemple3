import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AppTest {
    @Test
    public void testAddition() {
        CalculatorService service = new CalculatorService();
        int result = service.add(Arrays.asList(2, 3));
        assertEquals(5, result);
    }

    @Test
    public void testAdditionZero() {
        CalculatorService service = new CalculatorService();
        int result = service.add(Arrays.asList(0, 0));
        assertEquals(0, result);
    }
}