 package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTester {

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, scoreForOne("ONES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, scoreForOne("ONES", new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, scoreForOne("ONES", new int[] { 1, 1, 1, 1, 1 }));
    }

    @Test
    void shouldCalculateForTwos() {
        assertEquals(1, scoreForTwos("TWOS", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(2, scoreForTwos("TWOS", new int[] { 2, 1, 4, 2, 1 }));
        assertEquals(3, scoreForTwos("TWOS", new int[] { 1, 2, 1, 2, 2 }));
    }

    @Test
    void shouldCalculateForThrees() {
        assertEquals(1, scoreForThrees("THREES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(0, scoreForThrees("THREES", new int[] { 2, 1, 4, 2, 1 }));
        assertEquals(2, scoreForThrees("THREES", new int[] { 3, 2, 1, 3, 2 }));
    }

    @Test
    void shouldCalculateForFours() {
        assertEquals(1, scoreForFours("THREES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(2, scoreForFours("THREES", new int[] { 2, 1, 4, 2, 4 }));
        assertEquals(3, scoreForFours("THREES", new int[] { 3, 4, 1, 4, 4 }));
    }

    @Test
    void shouldCalculateForFives() {
        assertEquals(1, scoreForFives("THREES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(0, scoreForFives("THREES", new int[] { 2, 1, 4, 2, 1 }));
        assertEquals(4, scoreForFives("THREES", new int[] { 5, 5, 1, 5, 5 }));
    }

    @Test
    void shouldCalculateForSixes() {
        assertEquals(1, scoreForSixes("THREES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, scoreForSixes("THREES", new int[] { 2, 6, 6, 2, 6 }));
        assertEquals(2, scoreForSixes("THREES", new int[] { 6, 2, 1, 6, 2 }));
    }

    @Test
    void shouldCalculateForPair() {
        assertEquals(0, scoreForPair(YatziCategory.PAIR, new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(6, scoreForPair(YatziCategory.PAIR, new int[] { 3, 2, 3, 4, 5 }));
        assertEquals(12, scoreForPair(YatziCategory.PAIR, new int[] { 3, 6, 6, 4, 5 }));
    }

    private int scoreForOne(String yatziCategory, int[] dice) {
        int amountOfOne = 0;
        for (int die : dice){
            if (die == 1){
                amountOfOne++;
            }
        }
        return amountOfOne;
    }

    private int scoreForTwos(String yatziCategory, int[] dice) {
        int amountOfTwos = 0;
        for (int die : dice){
            if (die == 2){
                amountOfTwos++;
            }
        }
        return amountOfTwos;
    }

    private int scoreForThrees(String yatziCategory, int[] dice) {
        int amountOfThrees = 0;
        for (int die : dice){
            if (die == 3){
                amountOfThrees++;
            }
        }
        return amountOfThrees;
    }

    private int scoreForFours(String yatziCategory, int[] dice) {
        int amountOfFours = 0;
        for (int die : dice){
            if (die == 4){
                amountOfFours++;
            }
        }
        return amountOfFours;
    }

    private int scoreForFives(String yatziCategory, int[] dice) {
        int amountOfFives = 0;
        for (int die : dice){
            if (die == 5){
                amountOfFives++;
            }
        }
        return amountOfFives;
    }

    private int scoreForSixes(String yatziCategory, int[] dice) {
        int amountOfSixes = 0;
        for (int die : dice){
            if (die == 6){
                amountOfSixes++;
            }
        }
        return amountOfSixes;
    }

    private int scoreForPair(YatziCategory pair, int[] dice) {
        int[] frequencies = new int[6];
        for (int die : dice){
           frequencies[die-1]++;
        }
        for (int i = 0; i < frequencies.length; i++){
            if (frequencies[i] == 2){
                return (i+1)*2;
            }
        }
        return 0;
    }


}

