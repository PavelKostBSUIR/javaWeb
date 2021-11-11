package by.bsuir.kostukevich.task_1;

import static java.lang.Math.*;

public class Expression {
    public static double calculate(double X, double Y) {
        double numerator = (pow(sin(X + Y), 2) + 1);
        double denominator = 2 + abs(X - (2 * X / (1 + (pow(X, 2) * pow(Y, 2)))));
        double a = numerator / denominator;
        return a + X;
    }
}
