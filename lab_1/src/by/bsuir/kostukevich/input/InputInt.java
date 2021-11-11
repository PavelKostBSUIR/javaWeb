package by.bsuir.kostukevich.input;

import java.util.Scanner;

public class InputInt {
    public static int getInputInt() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("INCORRECT NUMBER");
                scanner.next();
            }
        }
        throw new RuntimeException("Error in int input");
    }
}
