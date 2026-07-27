package datastructurealg.prefixsum;

public class MinimumValueToGetPositiveStepByStepSum {
    static void main() {
        int[] nums = {-3,2,-3,4,2};
        int start_value = 1;
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            sum = sum + nums[0]+start_value;
            if (sum <= 0) {
                start_value = start_value + 1;
                sum =0;
                continue;
            }
            for (i=1; i < nums.length; i++) {
                sum = sum + nums[i];
                if (sum <= 0) {
                    start_value = start_value + 1;
                    i=0;
                    break;
                }
            }
        }
        System.out.println(start_value);
    }
}
