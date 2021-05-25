package de.htwberlin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CakeCandlesTest {

    @Test
    void cakeCounter() {
        CakeCandles cake = new CakeCandles(Arrays.asList(3,8, 34,45,67, 5,66, 4,88));
       List<Integer> actual = Arrays.asList(3,8, 34,45,67, 5,66, 4,88);
       String expected = "number of longest candles are 1 and they are 88cm long";

       assertEquals(expected, cake.CakeCounter(actual));

    }
    @Test
    void cakeCounterTwo() {
        CakeCandles cake = new CakeCandles(Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5));
        List<Integer> actual = Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5);
        String expected = "number of longest candles are 2 and they are 5cm long";

        assertEquals(expected, cake.CakeCounter(actual));

    }

    @Test
    void cakeTest() {
        CakeCandles cake = new CakeCandles(Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5));
        List<Integer> actual = Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5);
        String expected = "longest candle 5 cm second longest candle 4 cm third longest candle is 3 cm";

        assertEquals(expected, cake.CakeCalculater(actual));

    }

    @Test
    void cakeTestTwo() {
        CakeCandles cake = new CakeCandles(Arrays.asList(3,8, 34,45,67, 5,66, 4,88));
        List<Integer> actual = Arrays.asList(3,8, 34,45,67, 5,66, 4,88);
        String expected = "longest candle 88 cm second longest candle 67 cm third longest candle is 66 cm";

        assertEquals(expected, cake.CakeCalculater(actual));

    }

}