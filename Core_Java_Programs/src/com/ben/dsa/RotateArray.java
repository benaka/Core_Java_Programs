package com.ben.dsa;

public class RotateArray
{
    public static void main(String[] args)
    {
        int k =4;
        int[] nums={1,2,3,4,5,6,7};
        int n= nums.length;
         k=k%n;
         reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);
         for (int i=0;i<nums.length;i++)
         {
             System.out.println("reversed array is: "+nums[i]);
         }

    }
    static void reverse(int[] nums, int start, int end)
    {
        int i= start,j=end;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
