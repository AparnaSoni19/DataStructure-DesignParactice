package datastructurealg.slidingwindow;

public class MaxConsecutiveOnesIII {
    static void main() {
        int[] nums ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k =3;
        int allowed_zero = k;
        int consecutiveOne =0;
        int max_consecutiveOne =0;
        int i =0;
        int j = 0;
        while(j<nums.length)
        {
            if(nums[j]==1)
            {
                consecutiveOne++;
                j++;
            }else if(nums[j]==0 && allowed_zero>0)
            {
                allowed_zero=allowed_zero-1;
                consecutiveOne++;
                j++;
            } else if(allowed_zero<=0)
            {
                i++;
                consecutiveOne=0;
                allowed_zero=k;
//                while(nums[i]==1)
//                {
//                    i++;
//                }
                j =i;

            }

            max_consecutiveOne=Math.max(consecutiveOne,max_consecutiveOne);

        }
        System.out.println(max_consecutiveOne);
    }
}
