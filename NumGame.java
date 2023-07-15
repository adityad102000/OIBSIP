
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        int answer, guess,i;
        final int MAX = 100;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        int K = 6;
        for ( i = 0; i < K; i++) {
            System.out.println("Guess a number between 1 to 100");


            guess = keyboard.nextInt();
            if (guess == answer) {
                System.out.println("Good job, the number was" + answer);
            } else if (guess > answer) {
                System.out.println("guess a smaller number");
            } else if (guess < answer) {
                System.out.println("guess a larger number");
            }}

        if (i == K) {System.out.println(
                "You have exhausted"
                        + " 6 trials.");

            System.out.println(
                    "The number was " + answer);

        }
    }
}