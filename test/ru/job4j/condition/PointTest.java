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
        Point pointFirst = new Point(inX1, inY1);
        Point pointSecond = new Point(inX2, inY2);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3DTest() {
        int inX1 = -2;
        int inY1 = 5;
        int inZ1 = 6;
        int inX2 = 9;
        int inY2 = 0;
        int inZ2 = 2;
        double expected = 12.73;

        Point pointFirst = new Point(inX1, inY1, inZ1);
        Point pointSecond = new Point(inX2, inY2, inZ2);
        double out = pointFirst.distance3d(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }
}
