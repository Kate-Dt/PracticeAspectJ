package main;

import java.util.Random;

public class Quiz {

    public void start(String gameName){
        System.out.println("Game " + gameName + " started.");
            Random r = new Random();
            int points = r.nextInt(100);
            if (points > 50) {
                System.out.println(points);
                throw new ArithmeticException();
            }
    }
}
