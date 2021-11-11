package by.bsuir.kostukevich.task_6;

import by.bsuir.kostukevich.input.InputInt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter matrix side:");
        System.out.println(Arrays.deepToString(Matrix.getMatrix(InputInt.getInputInt())));
    }
}
