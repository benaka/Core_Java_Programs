package com.ben.dsa;

public class MaxProductOfSubArray
{
    public static void main(String[] args)
    {
        int[] nums = {2, 3, -2, 4};
        if (nums == null || nums.length == 0)
        {
             System.out.println("Maximum Product is :"+0);
        }
        else
        {
            int maxProduct = nums[0];
            int minProduct = nums[0];

            int result = nums[0];
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]>=0)
                {
                    maxProduct = Math.max(nums[i],maxProduct*nums[i]);
                    minProduct = Math.min(nums[i],minProduct*nums[i]);
                }
                else
                {
                    int temp = maxProduct;
                    maxProduct = Math.max(nums[i],minProduct*nums[i]);
                    minProduct = Math.min(nums[i],temp*nums[i]);
                }
                result = Math.max(result,maxProduct);
            }
            System.out.println("Maximum Product is: "+result);
        }
    }
}
