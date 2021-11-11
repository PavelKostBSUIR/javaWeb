package by.bsuir.kostukevich.task_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        int i = 0;
        while (i < 5) {
            balls.add(new Ball(Color.BLUE, i));
            balls.add(new Ball(Color.RED, i));
            i++;
        }
        Basket basket = new Basket(balls);
        System.out.println(balls);
        System.out.println("Basket weight:" + basket.getBasketWeight());
        System.out.println("Number of blue balls:" + basket.getNumberOfBlueBalls());
    }
}
