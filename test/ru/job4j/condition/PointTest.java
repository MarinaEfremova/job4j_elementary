package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest() {
        int inX1 = -2;
        int inY1 = 5;
        int inX2 = 9;
        int inY2 = 0;
        double expected = 12.08;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
