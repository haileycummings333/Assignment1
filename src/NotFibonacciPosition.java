import java.math.BigInteger;
import java.util.Scanner;

public class NotFibonacciPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        int position = findNotFibonacciPosition(inputNumber);

        System.out.println("Output: " + position);
    }

    public static int findNotFibonacciPosition(int inputNumber) {
        //intialize the first two terms in the sequence
        BigInteger term1 = BigInteger.ZERO; //O(1)
        BigInteger term2 = BigInteger.ONE; //O(1)

        //counter for position in sequence
        int position = 0; //O(1)

        //when negative, term1 is less than target number so keep searching
        while (term1.compareTo(BigInteger.valueOf(inputNumber)) <= 0) { //O(N)
            if (term1.equals(BigInteger.valueOf(inputNumber))) { //O(1)
                return position;
            }

            //calculate next term, copied from previous problem
            BigInteger nextTerm = (term1.multiply(BigInteger.TWO)).add(term2.multiply(BigInteger.valueOf(3))); //O(1)
            term1 = term2; //term1 is the n-2 term,  O(1)
            term2 = nextTerm; //term2 is the n-1 or previous term, O(1)

            //increase position counter
            position++; //O(1)
        }

        //to get position of closet lowest number in the not fibonacci sequence
        return position -1;
}
}

