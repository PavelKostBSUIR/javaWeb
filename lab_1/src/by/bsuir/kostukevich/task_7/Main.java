package by.bsuir.kostukevich.task_7;

import by.bsuir.kostukevich.input.InputDouble;
import by.bsuir.kostukevich.input.InputInt;
import by.bsuir.kostukevich.input.RandomArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length:");
        double[] array = RandomArray.getDoubleArray(InputInt.getInputInt());

        System.out.println(Arrays.toString(array));
        Sort.shellSort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
