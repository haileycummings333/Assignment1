public class Main {
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "def";
        //expected output would be "ace"

        //print the input
        System.out.println("Input: ");
        System.out.println("Text1: " + text1);
        System.out.println("Text2: " + text2);

        //call longestCommonSubsequence method on the two strings
        String result = longestCommonSubsequence(text1, text2);

        //print the output string and the length
        System.out.println("");
        System.out.println("Output: " + result);
        System.out.println("Length of Longest Common Subsequence: " + result.length());

    }

    public static String longestCommonSubsequence(String text1, String text2) {
        //store strings as char arrays to iterate through
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();

        //get length of total string
        int m = str1.length;
        int n = str2.length;


        String commonSubsequence = "";

        int i = 0;
        int j = 0;
        //for loop to iterate through the char arrays and
        //compare for matching letters

        //for each char in the str1 array, compare
        for (char currentChar : str1) {
            //no match & within bounds of the string
            while (i < n && str1[i] != currentChar) {
                //go to next index
                i++;
            }

            // i<n makes sure not to go out of bounds
            if (i < n) {
                //add the currentChar to the commonSubseqeunce
                commonSubsequence += currentChar;
                //go to next index
                i++;
            }
        }
        //return the common subsequence, it there is none it will return empty string
        return commonSubsequence;

    }

}