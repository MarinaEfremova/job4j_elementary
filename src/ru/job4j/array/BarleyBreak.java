package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] table = new int[3][3];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = 3 * i + j + 1;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.println(table[i][j]);
            }
        }
    }
}
