import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void successTest() {
        Assertions.assertEquals(2*2, 4);
    }

    @Test
    public void negativeTest() {
        Assertions.assertEquals(2*2, 6);
    }
}
