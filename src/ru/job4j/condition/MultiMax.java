package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int max2 = (first < second) ? second : first;
        return  max2 < third ? third : max2;
    }
}
