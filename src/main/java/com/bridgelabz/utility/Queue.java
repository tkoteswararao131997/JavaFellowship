package com.bridgelabz.utility;
public class Queue<T> 
{
	LinkedList<T> l=new LinkedList<T>();
	int range=5,capacity=0;
	/**
	 * insering element at last in queue
	 * @param item
	 */
	public void enqueue(T item)
	{
		if(size()==range)
		{
			System.out.println("queue overflow");
		}
		else
		{
			l.add(item);
			capacity++;
		}
	}
	/**
	 * deleting first element in queue
	 * @return
	 */
	public T dequeue()
	{
		if(isEmpty()==false)
		{
		T item=l.pop(0);
		capacity--;
		return item;
		}
		else
		{
			System.out.println("queue underflow");
		}
		return null;
		
	}
	/**
	 * finding size of queue
	 * @return
	 */
	public int size() 
	{
		return capacity;
	}
	/**
	 * checking queue is empty or not
	 * @return true or false
	 */
	public boolean isEmpty()
	{
		return capacity==0;
	}
	/**
	 * display the queue elements
	 * @param args
	 */
	public void show()
	{
		l.show();
	}
	public static void main(String[] args) 
	{
		Queue<Integer> q=new Queue<Integer>();
		q.enqueue(21);
		q.enqueue(20);
		q.enqueue(20);
		q.enqueue(20);
		q.enqueue(20);
		q.dequeue();
		q.show();
	}
}
