package by.bsuir.kostukevich.task_8;

public class ArrayActions {
    public static int[] getIndexesOfArrayMerging(double[] array_1, double[] array_2) {
        int[] indexes = new int[array_2.length];
        int left = 0;
        for (int j = 0; j < array_2.length; j++) {
            for (int i = left; i < array_1.length; i++) {
                if (array_1[i] >= array_2[j]) {
                    indexes[j] = i;
                    break;
                }
                left = i;
            }
        }
        return indexes;
    }

    public static void printIndexesOfArrayMerging(int[] indexes) {
        for (int i = 0; i < indexes.length; i++) {
            System.out.print("b_" + i + ": " + indexes[i] + "   ");
        }
    }
}
