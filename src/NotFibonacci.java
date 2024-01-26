import java.math.BigInteger;
import java.util.Scanner;

public class NotFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the NotFibonacci sequence: ");
        int numTerms = scanner.nextInt();

        generateNotFibonacci(numTerms);
    }

    private static void generateNotFibonacci(int numTerms) {
        //intialize the first two terms in the sequence
        BigInteger term1 = BigInteger.ZERO; //O(1)
        BigInteger term2 = BigInteger.ONE; //O(1)

        System.out.println("NotFibonacci Sequence for first " + numTerms + " terms: ");

        for (int i = 0; i < numTerms; i++) { //O(N)
            //print out each terms
            System.out.print(term1 + " ");

            //calculate the next term
            //take previous term (term2) multiply by 2, and add to the term before (term 1)

            //equation on the document doesn't match what the text says

            //this is for the described formula
            BigInteger nextTerm = term1.add(term2.multiply(BigInteger.valueOf(2))); //O(1)


            //this is for the shown formula in the document
            BigInteger nextTermSecondEq = (term1.multiply(BigInteger.TWO)).add(term2.multiply(BigInteger.valueOf(3))); //O(1)

            //update terms for the next calulation
            term1 = term2; //O(1)
            term2 = nextTermSecondEq; //O(1)
        }
    }
}
