package com.stackdemo;
class MyStack{
	int top;
	int size;
	int stk[];
	public MyStack(int size)
	{
		top=-1;
		this.size=size;
		stk=new int[this.size];
	}
	boolean push(int data) 
	{
		if(top<(size-1))
		{
			top++;
			stk[top]=data;
			return true;
		}
		else
		{
			System.out.println("over flow");
			return false;
		}
		
	}
	void pop()
	{
		if(top!=-1)
		{
			System.out.println(stk[top]);
			top--;
		}
		else
		{
			System.out.println("under flow");
		}
	}
	void display()
	{
		if(top!=-1)
		{
			System.out.println();
			System.out.println("[");
			for(int i=0;i<stk.length;i++)
			{
				System.out.println(stk[i]);
			}
			System.out.println("]");
		}
		else
			System.out.println("stack is empty");
	}
	
	
}
public class StackArray {
	public static void main(String[] args) {
	
	}
	

}
