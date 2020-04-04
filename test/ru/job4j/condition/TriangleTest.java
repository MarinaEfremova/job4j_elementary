package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle triangle = new Triangle(ap, bp, cp);

        double expected = 2;
        double result = triangle.area();
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 0);
        Point cp = new Point(2, 0);
        Triangle triangle = new Triangle(ap, bp, cp);

        double expected = -1;
        double result = triangle.area();
        Assert.assertEquals(expected, result, 0.01);
    }
}