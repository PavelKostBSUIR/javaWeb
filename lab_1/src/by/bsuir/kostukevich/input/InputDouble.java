package by.bsuir.kostukevich.input;

import java.util.Scanner;

public class InputDouble {
    public static double getInputDouble() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("INCORRECT NUMBER");
                scanner.next();
            }
        }
        throw new RuntimeException("Error in double input");
    }
}