package com.bridgelabz.utility;

public class Stack<T> 
{
	int capacity=0,range=5;
	LinkedList<T> l=new LinkedList<T>();
	/**
	 * add item to stack
	 * @param item
	 */
	public void push(T item)
	{
		if(range==size())
			System.out.println("stack overflow");
		else
		{
			l.add(item);
			capacity++;
		}
	}
	/**
	 * pop the last element in the stack
	 */
	public void pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("stack underflow");
		}
		else
		{
			capacity--;
			l.pop();
		}
	}
	/**
	 * check the stack empty or not
	 * @return true or false
	 */
	public boolean isEmpty() 
	{
		return capacity==0;
	}
	/**
	 * calculating stack size
	 * @return stack size
	 */
	public int size() 
	{
		//System.out.println(capacity);
		return capacity-1;
	}
	public T peek()
	{
		return l.lastele();
	}
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(20);
		s.push(9);
		System.out.println(s.size());
		
		
	}
}
