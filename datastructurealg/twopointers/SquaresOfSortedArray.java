package datastructurealg.twopointers;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        SquaresOfSortedArray sb = new SquaresOfSortedArray();
        int[] nu = {-4, -1, 0, 3, 10};
        System.out.println(sb.sortedSquares(nu));
    }

    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] arr = new int[nums.length];
        int j = nums.length - 1;
        while (start < end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                arr[j] = nums[start] * nums[start];
                j--;
                start++;
            } else if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                arr[end] = nums[end] * nums[end];
                end--;
                j--;
            }
        }
        arr[0] =nums[start];

        return arr;
    }

}