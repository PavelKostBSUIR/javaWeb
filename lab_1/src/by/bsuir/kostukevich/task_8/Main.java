package by.bsuir.kostukevich.task_8;

import by.bsuir.kostukevich.input.InputInt;
import by.bsuir.kostukevich.input.RandomArray;
import by.bsuir.kostukevich.task_7.Sort;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array 1 length:");
        double[] array_1 = RandomArray.getDoubleArray(InputInt.getInputInt());
        Sort.shellSort(array_1);
        System.out.println("Enter array 2 length:");
        double[] array_2 = RandomArray.getDoubleArray(InputInt.getInputInt());
        Sort.shellSort(array_2);
        System.out.println(Arrays.toString(array_1));
        System.out.println(Arrays.toString(array_2));
        ArrayActions.printIndexesOfArrayMerging(ArrayActions.getIndexesOfArrayMerging(array_1, array_2));
    }
}
