package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = findLoop.indexOf(input, value);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasNotElement() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = findLoop.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
