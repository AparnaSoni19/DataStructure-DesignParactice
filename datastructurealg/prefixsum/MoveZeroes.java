package datastructurealg.prefixsum;

import java.util.Arrays;

public class MoveZeroes {
    static void main() {
        int[] nums  = {0,1,0,3,12};
        int[] arr = new int[nums.length];
        int j =0;
        int k = arr.length-1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                arr[k]=0;
                k--;
            }else {
                arr[j]=nums[i];
                j++;
            }
        }
        Arrays.stream(arr).forEach(a-> System.out.print(a+" "));
    }
}
