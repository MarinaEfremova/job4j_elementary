package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expectd = new int[]{0, 1, 4};
        assertThat(result, is(expectd));
    }

    @Test
    public void whenBound5Then0104916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expectd = new int[] {0, 1, 4, 9, 16};
        assertThat(result, is(expectd));
    }
}
