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
		if(size()==range)
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
			l.pop();
			capacity--;
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
		return capacity;
	}
	public T peek()
	{
		return l.lastele();
	}
	public void show()
	{
		l.show();
	}
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(21);
		s.push(21);
		s.push(21);
		s.push(21);
		s.push(21);
		s.show();
		System.out.println(s.size());
		
	}
}
