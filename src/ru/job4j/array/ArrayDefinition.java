package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "cat";
        names[1] = "dog";
        names[2] = "mouse";
        names[3] = "duck";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
