public class Main {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        //expected output would be "a" or "c"

        //call longestCommonSubsequence method on the two strings


    }

    public static int longestCommonSubsequence(String text1, String text2) {
        //store strings as char arrays to iterate through
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();

        //get length of total string
        int m = str1.length;
        int n = str2.length;

        //array to store intermediate values
        int[] intermed = new int[n + 1];


        //for loops to iterate through the char arrays and
        //compare for matching letters

        return intermed[n];
    }

}