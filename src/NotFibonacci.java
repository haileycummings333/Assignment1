import java.math.BigInteger;
import java.util.Scanner;

public class NotFibonacci {

    private static void generateNotFibonacci(int numTerms) {
        //intialize the first two terms in the sequence
        BigInteger term1 = BigInteger.ZERO;
        BigInteger term2 = BigInteger.ONE;

        System.out.println("NotFibonacci Sequence for first " + numTerms + " terms: ");

        for (int i = 0; i < numTerms; i++) {
            //print out each terms
            System.out.print(term1 + " ");

            //calculate the next term
            BigInteger nextTerm = term2.multiply(BigInteger.valueOf(2)).add(term1);

            //update terms for the next calulation
            term1 = term2;
            term2 = nextTerm;
        }
    }
}
