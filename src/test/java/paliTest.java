import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class paliTest {

    @Test
    void poli() {
        assertEquals(true, pali.poli("123321"));
        assertEquals(false, pali.poli("1231"));

    }
}