package org.example;

public class missingNumber {
    public static void callMissingNumber() {
        int[] nums = {1,2, 3, 5, 4, 6, 7, 8, 9 };
        System.out.println("The missing number is " + missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            sum += nums[i];
        }
        int naturalsum = (length*(length+1))/2;
        if (sum == naturalsum) {
            return 0;
        }
        return naturalsum - sum;
    }
}
