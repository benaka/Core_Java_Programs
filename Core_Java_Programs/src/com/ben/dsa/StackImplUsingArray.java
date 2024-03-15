package com.ben.dsa;

public class StackImplUsingArray 
{
	int maxSize;
	int[] stack;
	int[] stack_new;
	int push=-1;
	int pop=0;
	//added default and argumented constructor to facilitate intialize stack with defualt capacity and sepcified size
	public StackImplUsingArray(int maxSize) {
		super();
		this.maxSize = maxSize;
		stack= new int[maxSize];
		stack_new= new int[maxSize-1];
	}
	public StackImplUsingArray() {
		super();
		stack= new int[10];
		
	}
	
	public int push(int data)
	{
		push=push+1;
		stack[push]=data;
		System.out.println("Array after push Operation:");
		for(int i=0;i<stack.length;i++)
		{
			System.out.print(stack[i]+",");
			//System.out.println("\n");
		}
		return push;
		
	}
	
	public int pop()
	{
		int k=0;
		for(int i=0;i<stack.length;i++)
		{
			if(!(i==0))
			{
				stack_new[k]=stack[i];
				k++;
			}
		}
		System.out.println("Array after pop Operation:");
		for(int i=0;i<stack_new.length;i++)
		{
			System.out.print(stack_new[i]+",");
			//System.out.println("\n");
		}
		
		return stack[k];
	}
	
	public void printStack()
	{
		for(int i=0;i<stack_new.length;i++)
		{
			System.out.print(stack_new[i]+",");
		}
	}

	

}
