package by.pvt.data;

import java.util.Random;

/**
 *
 */
public class InputDataGenerator {

    public static int[] generate(int arrayLenght, int minElementValue, int maxElementValue) {

        if (arrayLenght == Integer.MAX_VALUE
                || minElementValue == Integer.MIN_VALUE
                || maxElementValue == Integer.MAX_VALUE
                || arrayLenght < 0
        ) return null;


        return new Random()
                .ints(arrayLenght, minElementValue, maxElementValue)
                .toArray();

    }

    public static int[] generate() {
        return generate(100, 0 ,100);
    }
}
