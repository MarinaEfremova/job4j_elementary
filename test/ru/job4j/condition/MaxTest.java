package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstIsMax() {
        int inFirst = 100;
        int inSecond = 60;
        int expected = 100;
        int out = Max.max(inFirst, inSecond);
        assertEquals(expected, out);
    }

    @Test
    public void whenSecondIsMax() {
        int inFirst = 10;
        int inSecond = 60;
        int expected = 60;
        int out = Max.max(inFirst, inSecond);
        assertEquals(expected, out);
    }

    @Test
    public void whenBothIsEquals() {
        int inFirst = 10;
        int inSecond = 10;
        int expected = 10;
        int out = Max.max(inFirst, inSecond);
        assertEquals(expected, out);
    }
}
