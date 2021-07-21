import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CacheWorkTest {

    @Test
    public void testPut() {
        CacheWork cw = new CacheWork();
        assertTrue(cw.put("first", "1", "23456"));
        assertFalse(cw.put("first", "1", "23456"));
        assertEquals(1, cw.getSize());
    }

    @Test
    public void testGet() {
        CacheWork cw = new CacheWork();
        cw.put("first", "1", "23456");
        cw.put("second", "2", "12345");
        assertEquals("23456", cw.get("first", "1"));
        assertEquals("12345", cw.get("second", "2"));
        cw.clear();
        assertNull(cw.get("first", "1"));
    }

    @Test
    public void testFullClear() {
        CacheWork cw = new CacheWork();
        cw.put("first", "1", "23456");
        cw.put("second", "2", "12345");
        cw.clear();
        assertNull(cw.get("first", "1"));
        assertEquals(0, cw.getSize());
    }

    @Test
    public void testPartClear() {
        CacheWork cw = new CacheWork();
        cw.put("first", "1", "23456");
        cw.put("second", "2", "12345");
        cw.clear("first");
        assertNull(cw.get("first", "1"));
        assertEquals("12345", cw.get("second", "2"));
        assertEquals(1, cw.getSize());
    }
}