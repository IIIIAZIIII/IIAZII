import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table TestTable;
    @BeforeEach
    void setUp() {
        TestTable = new Table(3,3);
        for (int i = 0; i < TestTable.Rows(); i++){
            for(int j = 0; j < TestTable.Cols(); j++){
                TestTable.setValue(i,j,1);
            }
        }
    }

    @Test
    void getValue() {
        assertEquals(1,TestTable.GetValue(1,1));
        assertEquals(1,TestTable.GetValue(0,1));
        assertEquals(1,TestTable.GetValue(1,0));
        assertEquals(1,TestTable.GetValue(0,2));
        assertEquals(1,TestTable.GetValue(1,2));
    }

    @Test
    void cols() {
        assertEquals(3,TestTable.Cols());
    }

    @Test
    void rows() {
        assertEquals(3,TestTable.Rows());
    }

    @Test
    void testToString() {
        assertEquals("1 1 1 \n1 1 1 \n1 1 1 \n",TestTable.toString());
    }

    @Test
    void average() {
        assertEquals(1,TestTable.average());
    }
}