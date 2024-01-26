public class RemoveElement {

    public static void main(String[] args) {
        //some values to test with

        int[] nums = {3, 2, 2, 3, 4, 5, 3, 6};
        int val = 3;

        int result = removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + result);
        System.out.print("Updated array: [");

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("]");

    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;//O(1)

        for (int i = 0; i < nums.length; i++) { //O(N) iterates N times
            // if the current element is not equal to val, update the array and move index forward
            if (nums[i] != val) { //O(1)
                nums[index] = nums[i]; //O(1)
                index++; //O(1)
            }
        }

        return index;
    }

}
