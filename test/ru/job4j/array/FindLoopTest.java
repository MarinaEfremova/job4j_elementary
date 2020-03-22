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

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNoElementInDiapason() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 7;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
