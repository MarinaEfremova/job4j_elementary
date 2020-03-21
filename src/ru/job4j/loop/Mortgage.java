package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double pay = amount;

        while (pay > 0) {
            year++;

            pay = pay + pay * (percent / 100.0);
            pay = pay - salary;
        }
        return year;
    }
}
