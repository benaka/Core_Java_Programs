package com.ben.dsa;

public class MaxsumOfSubArray
{
    public static void main(String[] args)
    {
        int[] nums = {1,8,-6,9,5,4,-3,6};
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(currentSum<0)
            {
                currentSum=0;
            }
            currentSum=currentSum+nums[i];
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
        }
        System.out.println("maximum sum is "+maxSum);
    }

}