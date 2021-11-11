package by.bsuir.kostukevich.task_2;

import by.bsuir.kostukevich.input.InputDouble;

public class Main {
    public static void main(String[] args) {
        if (Graphic.checkPoint(getPoint())) {
        } else {
            System.out.println("Doesn't belong:");
        }
    }

    private static Point getPoint() {
        System.out.println("Enter x:");
        double x = InputDouble.getInputDouble();
        System.out.println("Enter y:");
        double y = InputDouble.getInputDouble();
        return new Point(x, y);
    }
}
