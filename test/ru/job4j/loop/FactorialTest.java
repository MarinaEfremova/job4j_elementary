package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5;
        int expected = 120;
        int actual = Factorial.calc(n);
        assertThat(actual, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int actual = Factorial.calc(n);
        assertThat(actual, is(expected));
    }

}
