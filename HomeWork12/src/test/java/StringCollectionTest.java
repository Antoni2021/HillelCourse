import com.work.StringCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    StringCollection tested = new StringCollection(5);

    @Test
    void deleteTest() {
        assertTrue(tested.delete(4));
    }

    @Test
    void addTest() {
        assertTrue(tested.add(6));
    }

    @Test
    void getTest() {
        assertEquals("1", tested.get(1));
        assertEquals("There are no this index in the collection", tested.get(17));
    }

    @Test
    void containTest() {
        assertTrue(tested.contain("2"));
        assertFalse(tested.contain("17"));
    }

    @Test
    void clearTest() {
        assertTrue(tested.clear());
    }

    @Test
    void sizeTest() {
        assertEquals(tested.size(), 5);
    }
}