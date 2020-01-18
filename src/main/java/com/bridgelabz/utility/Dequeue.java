package com.bridgelabz.utility;

public class Dequeue<T>
{
	DoublyLinkedList<T> d=new DoublyLinkedList<T>();
	int range=50,capacity=0;
	/**
	 * add element at front of the queue
	 * @param item
	 */
	public void addFront(T item)
	{
		if(size()==range)
			System.out.println("queue overflow");
		else
		{
			d.addFirst(item);
			capacity++;
		}
	}
	/**
	 * add elements at the end of the queue
	 * @param item
	 */
	public void addRear(T item)
	{

		if(size()==range)
			System.out.println("queue overflow");
		else
		{
			d.addLast(item);
			capacity++;
		}
	}
	/**
	 * remove first element in the queue
	 * @return first element
	 */
	public T removeFront()
	{
		T item;
		if(isEmpty()==true)
			System.out.println("queue underflow");
		else
		{
			item=d.removeFront();
			capacity--;
			return item;
		}
		return null;
	}
	/**
	 * remove last element in the queue
	 * @return last ele
	 */
	public T removeRear()
	{
		T item;
		if(isEmpty()==true)
			System.out.println("queue underflow");
		else
		{
			item=d.removeLast();
			capacity--;
			return item;
		}
		return null;
	}
	/**
	 * check queue is empty or not
	 * @return true or false
	 */
	public boolean isEmpty() 
	{
		return capacity==0;
	}
	/**
	 * return size of queue
	 * @return size
	 */
	public int size() 
	{
		return capacity;
	}
	/**
	 * showing the queue
	 */
	public void show()
	{
		d.showForward();
	}
}
