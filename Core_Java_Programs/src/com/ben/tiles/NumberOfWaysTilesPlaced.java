package com.ben.tiles;

public class NumberOfWaysTilesPlaced {

	public static void main(String[] args) 
	{
		int n = 1, m = 2;
		System.out.println(numberOfWaysTilesPlaced(n,m));
		   
	}

	public static int numberOfWaysTilesPlaced(int N,int M)
	{
		
		int count[] = new int[N + 1];
		count[0]=0;
		int i;
		for(i=1;i<=N;i++)
		{
			if(i>M)
			{
				count[i]=count[i-1]+count[i-M];
			}
			else if(i<M||i==1)
			{
				count[i]=1;
			}
			else
			{
				count[i]=2;
			}
		}
		return count[N];
		
	}
}
