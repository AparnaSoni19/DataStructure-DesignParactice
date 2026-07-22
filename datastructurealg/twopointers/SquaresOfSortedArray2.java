package datastructurealg.twopointers;

public class SquaresOfSortedArray2 {

    public static void main(String[] args) {
        SquaresOfSortedArray2 sb = new SquaresOfSortedArray2();
        int[] nu = {-4, -1, 0, 3, 10};
        System.out.println(sb.sortedSquares(nu));
    }

    public int[] sortedSquares(int[] nums) {
       int[] arr = new int[nums.length];
       int len = nums.length-1;
       int start =0;
       for(int i = len;i>=0;i--)
       {
           if(Math.abs(nums[start])>Math.abs(nums[len])) {
               arr[i] = nums[start] * nums[start];
               start++;
           }else {
               arr[i] = nums[len] * nums[len];
               len--;
           }
       }
       return arr;
    }

}