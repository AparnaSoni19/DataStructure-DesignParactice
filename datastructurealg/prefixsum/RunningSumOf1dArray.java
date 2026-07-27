package datastructurealg.prefixsum;

import java.util.Arrays;
import java.util.SortedMap;

public class RunningSumOf1dArray {
    static void main() {
        int [] num={1,2,3,4};
        int sum =0;
        for(int i =0;i<num.length;i++)
        {
            sum= sum+num[i];
            num[i]=sum;
        }
        System.out.println(Arrays.toString(num));

    }
}
