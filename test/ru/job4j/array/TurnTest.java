package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turn.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = new int[]{4, 1, 3, 6, 2};
        int[] result = turn.back(input);
        int[] expect = new int[]{2, 6, 3, 1, 4};
        assertThat(result, is(expect));
    }
}
