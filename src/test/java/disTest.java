import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class disTest {

    @Test
    void DIS() {
        assertEquals("jopa", dis.DIS(0,0,0));
        assertEquals("x0=", dis.DIS(0,1,1));
        assertEquals("x1=", dis.DIS(2,4,1));
        assertEquals("x0=", dis.DIS(4,1,1));
        assertEquals("NONONO", dis.DIS(1,0,1));
    }
}