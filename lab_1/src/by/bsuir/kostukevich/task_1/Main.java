package by.bsuir.kostukevich.task_1;

import by.bsuir.kostukevich.input.InputDouble;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        double x = InputDouble.getInputDouble();
        System.out.println("Enter y:");
        double y = InputDouble.getInputDouble();
        System.out.println(Expression.calculate(x, y));
    }
}
