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

    // ----------------Tests for triple---------------------------------//
    @Test
    public void whenFirstIsMaxForTriple() {
        int inFirst = 100;
        int inSecond = 60;
        int inThird = 10;
        int expected = 100;
        int out = Max.max(inFirst, inSecond, inThird);
        assertEquals(expected, out);
    }

    @Test
    public void whenSecondIsMaxForThriple() {
        int inFirst = 10;
        int inSecond = 60;
        int inThird = 10;
        int expected = 60;
        int out = Max.max(inFirst, inSecond, inThird);
        assertEquals(expected, out);
    }

    @Test
    public void whenThirdIsMaxForThriple() {
        int inFirst = 10;
        int inSecond = 60;
        int inThird = 100;
        int expected = 100;
        int out = Max.max(inFirst, inSecond, inThird);
        assertEquals(expected, out);
    }

    @Test
    public void whenBothIsEqualsForThriple() {
        int inFirst = 10;
        int inSecond = 10;
        int inThird = 10;
        int expected = 10;
        int out = Max.max(inFirst, inSecond, inThird);
        assertEquals(expected, out);
    }

    // ----------------Tests for tetrad---------------------------------//
    @Test
    public void whenFirstIsMaxForTetrad() {
        int inFirst = 100;
        int inSecond = 60;
        int inThird = 10;
        int inFourth = 5;
        int expected = 100;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        assertEquals(expected, out);
    }

    @Test
    public void whenSecondIsMaxForTetrad() {
        int inFirst = 10;
        int inSecond = 60;
        int inThird = 10;
        int inFourth = 5;
        int expected = 60;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        assertEquals(expected, out);
    }

    @Test
    public void whenThirdIsMaxForTetrad() {
        int inFirst = 10;
        int inSecond = 60;
        int inThird = 100;
        int inFourth = 5;
        int expected = 100;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        assertEquals(expected, out);
    }

    @Test
    public void whenFourthIsMaxForTetrad() {
        int inFirst = 10;
        int inSecond = 60;
        int inThird = 100;
        int inFourth = 500;
        int expected = 500;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        assertEquals(expected, out);
    }

    @Test
    public void whenBothIsEqualsForTetrad() {
        int inFirst = 10;
        int inSecond = 10;
        int inThird = 10;
        int inFourth = 10;
        int expected = 10;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        assertEquals(expected, out);
    }
}
