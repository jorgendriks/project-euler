package projecteuler.problem1;

import java.util.stream.IntStream;

//Multiples of 3 and 5
public class Problem001 {
    
    private Problem001() {
        //Utility class
    }
 
    static int sumMultiples(int upperBound) {
        int result = 0;
        for (int i  = upperBound - 1; i > 0; i--) {
            if (i % 3 == 0
                    || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
    
    static int sumMultiplesLambda(int upperBound) {
        return IntStream.range(0, upperBound)
        .filter(Problem001::divisible)
        .sum();
    }
    
    static boolean divisible(int i) {
        return (i % 3 == 0) || (i % 5 == 0);
    }


}
