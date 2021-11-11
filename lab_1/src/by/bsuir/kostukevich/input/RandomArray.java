package by.bsuir.kostukevich.input;

public class RandomArray {
    public static int[] getIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int temp = (int) (Math.random() * 100) + 1;
            array[i] = temp;
        }
        return array;
    }

    public static double[] getDoubleArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            double temp = (Math.random() * 100) + 1;
            array[i] = temp;
        }
        return array;
    }

    public static void initIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = (int) (Math.random() * 100) + 1;
            array[i] = temp;
        }
    }
}
