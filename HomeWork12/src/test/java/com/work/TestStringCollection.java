package com.work;

import com.work.StringCollection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestStringCollection {

    StringCollection tested = new StringCollection(5);

    @Test
    void deleteTest() {
        Assertions.assertTrue(tested.delete(4));
    }

    @Test
    void addTest() {
        Assertions.assertTrue(tested.add(6));
    }

    @Test
    void getTest() {
        Assertions.assertEquals("1", tested.get(1));
        Assertions.assertEquals("There are no this index in the collection", tested.get(17));
    }

    @Test
    void containTest() {
        Assertions.assertTrue(tested.contain("2"));
        Assertions.assertFalse(tested.contain("17"));
    }

    @Test
    void clearTest() {
        Assertions.assertTrue(tested.clear());
    }

    @Test
    void sizeTest() {
        Assertions.assertEquals(tested.size(), 5);
    }
}