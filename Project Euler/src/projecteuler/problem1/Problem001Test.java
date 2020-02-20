package projecteuler.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Problem001Test {

    private int upperBound1 = 10;
    private int upperBound2 = 1000;
    @Test
    void testMultiples() {
        assertEquals(23, Problem001.sumMultiples(upperBound1));
        assertEquals(23, Problem001.sumMultiples(upperBound1));
        assertEquals(Problem001.sumMultiples(upperBound1), Problem001.sumMultiplesLambda(upperBound1));
        assertEquals(Problem001.sumMultiples(upperBound2), Problem001.sumMultiplesLambda(upperBound2));
    }
}
