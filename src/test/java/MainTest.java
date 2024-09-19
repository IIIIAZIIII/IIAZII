import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void jojo() {
        assertEquals("fizzbuzz", Main.jojo(35));
        assertEquals("buzz",Main.jojo(7));
        assertEquals("fizz",Main.jojo(5));
        assertEquals("",Main.jojo(1));
    }
}