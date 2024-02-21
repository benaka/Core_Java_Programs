package com.ben.array;

import java.util.Arrays;

public class CombiningTwoArrays {

	public static void main(String[] args) 
	{
        String[] input1= {"1","3","5"};
        String[] input2= {"a","b","c"};
        int inner=input1.length<input2.length?input1.length:input2.length;
        String[][] result=new String[input1.length*input2.length][inner];
        int k=0;
        for(int i=0;i<input1.length;i++)
        {
        	for(int j=0;j<input2.length;j++)
        	{
        		int r=0;
        		String[] s=new String[inner-1];
        		s[r++]=input1[i];
        		s[r++]=input2[j];
        		result[k++]=s;
        		
        	}
        }
        for(int i=0;i<result.length;i++)
        {
        	System.out.println(Arrays.toString(result[i]));
        }
	}

}
