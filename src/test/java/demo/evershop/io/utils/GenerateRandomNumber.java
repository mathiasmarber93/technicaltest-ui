package demo.evershop.io.utils;

import java.util.Random;

public class GenerateRandomNumber {

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

}
