package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};
        int[] result = SwitchArray.swap(input, 1, 2);
        assertThat(result, is(expected));
    }
}
