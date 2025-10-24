package com.ben.dsa;
//Given array is Binary
public class MaxConsecutiveOnes
{
    public static void main(String[] args)
    {
        int[] nums ={1,1,0,1,1,1};
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count=0;
            }
            else
            {
                count++;
            }
            if(count>ans)
            {
                ans=count;
            }
        }
        System.out.println("Maximum consecutiveOnes are :"+ans);
    }
}
