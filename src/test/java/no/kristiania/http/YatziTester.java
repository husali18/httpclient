 package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTester {

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, score("ONES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, score("ONES", new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, score("ONES", new int[] { 1, 1, 1, 1, 1 }));
    }

    private int score(String ones, int[] randomOutcome) {
        int amountsOfOnes = 0;
        for (int i = 0; i < randomOutcome.length; i++){
            if (randomOutcome[i] == 1){
                amountsOfOnes = amountsOfOnes + randomOutcome[i];
            }
        }
        return amountsOfOnes;
    }

}

