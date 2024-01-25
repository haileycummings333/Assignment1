public class Main {
    public static void main(String[] args) {
        String text1 = "abce";
        String text2 = "ace";
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
        char[] str1 = text1.toCharArray(); //O(1), S(N)
        char[] str2 = text2.toCharArray(); //O(1), S(N)

        //get length of total string
        int m = str1.length; //O(1), S(N)
        int n = str2.length; //O(1), S(N)

        //base string for the common subsequence
        String commonSubsequence = ""; //O(1), S(1)

        //for iterating through the arrays
        int i = 0; //O(1), S(1)
        int j = 0; //O(1), S(1)

        //stay within bounds of arrays
        while (i < m && j < n) { //O(N) in total
            // if characters match, add to commonSubsequence
            if (str1[i] == str2[j]) { //O(N)
                commonSubsequence += str1[i]; //O(1)
                i++; //O(1)
            }
            j++; //O(1)
        }


        //return the common subsequence, it there is none it will return empty string
        return commonSubsequence;

    }

    //Time Complexity is O(N)
    //Space Complexity is S(N)

}