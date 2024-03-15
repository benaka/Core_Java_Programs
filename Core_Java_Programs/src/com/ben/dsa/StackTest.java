package com.ben.dsa;

public class StackTest {

	public static void main(String[] args) 
	{
		
		StackImplUsingArray stack = new StackImplUsingArray(5);
		stack.push(40);
		stack.push(58);
		stack.push(39);
		stack.push(22);
		stack.push(76);
		//stack.printStack();
		int obj=stack.pop();
		System.out.println(obj);
		//stack.printStack();

	}

}
