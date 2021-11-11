package by.bsuir.kostukevich.task_3;

import by.bsuir.kostukevich.input.InputDouble;

import java.sql.SQLOutput;

public class TanFunction {
    private double a;
    private double b;
    private double h;

    public TanFunction() {
        initFields();
    }

    private void initFields() {
        while (true) {
            System.out.println("Enter a:");
            a = InputDouble.getInputDouble();
            System.out.println("Enter b:");
            b = InputDouble.getInputDouble();
            if (b > a) {
                break;
            } else {
                System.out.println("b should be > a");
            }
        }
        System.out.println("Enter h:");
        h = InputDouble.getInputDouble();
    }

    public void printTable() {
        System.out.println("----------------------------------");
        System.out.printf("|%s|--------|%s|\n", "argument", "Value");
        while (a <= b) {
            System.out.printf("|%s|--------|%s|\n", a, Math.tan(a));
            a = a + h;
        }
        System.out.println("----------------------------------");
    }
}
