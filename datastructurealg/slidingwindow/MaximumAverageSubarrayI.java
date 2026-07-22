package datastructurealg.slidingwindow;

public class MaximumAverageSubarrayI {
    static void main() {
        int[] nums ={-1};
        int k =1;
        double avg =0;
        double max_Avg =Integer.MIN_VALUE;
        int sum=0;
        for(int i =0;i<k;i++)
        {
            sum =sum+nums[i];
        }
        avg = (double) sum / k;
        max_Avg =Math.max(avg,max_Avg);
        for(int i =k;i<nums.length;i++)
        {
            sum = sum+nums[i]-nums[i-k];
            avg = (double) sum / k;
            max_Avg =Math.max(avg,max_Avg);
        }
        System.out.println(max_Avg);
    }
}
