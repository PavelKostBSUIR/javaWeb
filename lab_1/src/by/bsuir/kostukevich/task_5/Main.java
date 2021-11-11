package by.bsuir.kostukevich.task_5;

import by.bsuir.kostukevich.input.RandomArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = RandomArray.getIntArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(FinderBiggestSubSet.findNumCountToDelete(array));
    }
}
