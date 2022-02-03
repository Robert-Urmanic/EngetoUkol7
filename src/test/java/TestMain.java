import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void multiplyTest(){
        Main main = new Main();
        assertEquals(4, main.multiply(1,4));
    }
}
