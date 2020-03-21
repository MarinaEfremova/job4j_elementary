package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean res = CheckPrimeNumber.check(5);
        assertThat(res, is(true));
    }

    @Test
    public void when4() {
        boolean res = CheckPrimeNumber.check(4);
        assertThat(res, is(false));
    }

    @Test
    public void when1() {
        boolean res = CheckPrimeNumber.check(1);
        assertThat(res, is(false));
    }
}
