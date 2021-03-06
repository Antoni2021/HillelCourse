package com.work;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringCollectionTest {

    @RepeatedTest(100)
    public void testAdd() {
        Assertions.assertTrue(new StringCollection(0).add(7));
    }

    @Test
    public void testAddIndex() {
        Assertions.assertFalse(new StringCollection(4).add(17, "s"));
    }

    @Test
    public void testDelete() {
        Assertions.assertFalse(new StringCollection(0).delete(7));
    }

    @Test
    public void testGet() {
        Assertions.assertEquals("There is no that index", new StringCollection(0).get(18));
        Assertions.assertEquals("2", new StringCollection(3).get(2));
    }

    @Test
    public void testContain() {
        Assertions.assertFalse(new StringCollection(0).contain(7));
    }

    @Test
    public void testClear() {
        Assertions.assertFalse(new StringCollection(0).clear());
        Assertions.assertTrue(new StringCollection(1).clear());
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(4, new StringCollection(4).size());
    }
}
