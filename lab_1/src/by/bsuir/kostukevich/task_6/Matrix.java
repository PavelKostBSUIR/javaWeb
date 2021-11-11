package by.bsuir.kostukevich.task_6;

import by.bsuir.kostukevich.input.RandomArray;

public class Matrix {
    public static double[][] getMatrix(int length) {
        double[][] matrix = new double[length][length];
        double[] array = RandomArray.getDoubleArray(length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = array[(i + j) % length];
            }
        }
        return matrix;
    }
}
