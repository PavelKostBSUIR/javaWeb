package by.bsuir.kostukevich.task_7;

public class Sort {
    public static void shellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            boolean isBack = false;
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    isBack = true;
                    i--;
                }
            }
            if (!isBack) {
                i++;
            }
        }
    }
}
