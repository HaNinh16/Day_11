import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTestTest {

    @Test
    public void Check() {
        assertEquals(5, TestTest.Sum(3, 2));
        assertNotEquals(5, TestTest.Sum(3, 3));
        assertTrue(8 > TestTest.Sum(2,3),"8 > Tổng 2 & 3");
        assertFalse(2 > TestTest.Sum(3,1),"2 > Tổng 2 & 3");
    }

    @Test
    public void checkArry() {
        int[] Arry1 = new int[]{0, 2, 4, 6, 8};
        int[] Arry2 = new int[]{0, 2, 4, 6, 8};
        assertArrayEquals(Arry1, Arry2, "Hai mảng bằng nhau");

    }

    @Test
    public void checkSame() {
        String chuoi1 = "Check1";
        String chuoi2 = "Check2";
        String chuoi3 = "Check1";
        assertSame(chuoi1, chuoi3, "The same");
        assertNotSame(chuoi1,chuoi2,"Not same");
    }

    @Test
    public void CheckNull() {
        Object Check = new Object();
        assertNull(Check, null, "Null");
    }

    private void assertNull(Object Check, Object o, String Null) {
    }

    @Test
    public void CheckNotNull() {
        Object Checknull = new Object();
        assertNotNull(Checknull, null, "Not null");
    }

    private void assertNotNull(Object checknull, Object o, String not_null) {
    }

}