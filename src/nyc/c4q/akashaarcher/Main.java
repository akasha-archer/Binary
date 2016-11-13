package nyc.c4q.akashaarcher;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] guessingGame = {1, 4, 16, 24, 28, 32, 35, 42};
        System.out.println(binarySearch(guessingGame, 35));

    }


    public static int binarySearch(int[] array, int targetValue) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        while (maxIndex >= minIndex) {
            int guess = (maxIndex + minIndex) / 2;
            if (array[guess] == targetValue) {
                System.out.println("You win." + " " + targetValue + " is correct!");
                return targetValue;
            } else if (array[guess] < targetValue) {
                minIndex = guess + 1;
            } else if (array[guess] > targetValue) {
                maxIndex = guess - 1;
            }
        }
        return -1;
    }

}


/*

Let min = 0 and max = n-1.
If max < min, then stop: target is not present in array. Return -1.
Compute guess as the average of max and min, rounded down (so that it is an integer).
If array[guess] equals target, then stop. You found it! Return guess.
If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
Otherwise, the guess was too high. Set max = guess - 1.
Go back to step 2.
 */
