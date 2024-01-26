public class CommonSubsequence2 {
    //my original code didn't quite work so i watched a few youtube videos explaining dynamic programmings.
    //i linked the videos in the pdf with my answers to the text responses

    public static int longestCommonSubsequence(String text1, String text2) {
        //convert string to char arrays
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();

        //get the lengths
        int m = str1.length;
        int n = str2.length;

        //create 2d array for dynamic programming, to store the length of sub arrays
        int[][] dpArray = new int[m + 1][n + 1]; //space complexity S(N^2) if N is arbitarily the length of both strings

        //fill the dynamic programming array

        //iterate through the first array
        for (int i = 1; i <= m; i++) { //O(N)*O(N) = O(N^2)

            //iterate through the second array
            for (int j = 1; j <= n; j++) { //O(N)

                if (str1[i-1] == str2[j-1]) { //O(1)
                    //plus one because found a match between the two strings
                    //so length of current subsequence increases by 1
                    dpArray[i][j] = dpArray[i-1][j-1] + 1; //O(1)
                } else {
                    //store the max length at current position, so once we get to the end
                    //it should have the value of the longest subsequence
                    dpArray[i][j] = Math.max(dpArray[i - 1][j], dpArray[i][j - 1]); //O(1)
                }
            }
        }

        //return the length of the longest subsequence
        return dpArray[m][n];
    }

    public static void main(String[] args) {
        //test values from assignment handout
        String text1 = "abc";
        String text2 = "abc";
        System.out.println("Input: text1: " + text1 + ", " +  "text2: " + text2);
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));

        text1 = "almanacs";
        text2 = "albatross";
        System.out.println("Input: text1: " + text1 + ", " +  "text2: " + text2);
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));

        text1 = "almanac";
        text2 = "ferris";
        System.out.println("Input: text1: " + text1 + ", " +  "text2: " + text2);
        System.out.println("Output: " + longestCommonSubsequence(text1, text2));
    }
}
