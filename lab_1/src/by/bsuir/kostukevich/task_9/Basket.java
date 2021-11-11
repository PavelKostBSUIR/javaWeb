package by.bsuir.kostukevich.task_9;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getBasketWeight() {
        int basketWeight = 0;
        for (Ball ball : balls) {
            basketWeight += ball.getWeight();
        }
        return basketWeight;
    }

    public int getNumberOfBlueBalls() {
        int number = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == Color.BLUE) {
                number += 1;
            }
        }
        return number;
    }
}
