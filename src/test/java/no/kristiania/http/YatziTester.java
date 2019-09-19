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

    private int scoreForOne(String yatziCategory, int[] dice) {
        int amountOfOne = 0;
        for (int die : dice){
            if (die == 1){
                amountOfOne = amountOfOne+1;
            }
        }
        return amountOfOne;
    }





}

