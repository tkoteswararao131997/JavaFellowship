package com.bridgelabz.utility;

public class DoublyLinkedList<T>
{
	class Node<T>{
		Node<T> next;
		Node<T> prev;
		T data;
		Node(T d)
		{
			data=d;
		}
	}
	Node<T> head;
	Node<T> tail;
	/**
	 * adding elements at starting of list
	 * @param item
	 */
	public void addFirst(T item)
	{
		Node<T> node=new Node<T>(item);
		if(tail==null)
		{
			tail=node;
		}
		
		else
		{
			head.prev=node;
		}
			
			node.next=head;
			head=node;
			
	}
	/**
	 * adding elements at end of the list
	 * @param item
	 */
	public void addLast(T item)
	{
		Node<T> node=new Node<T>(item);
		if(head==null)
			head=node;
		else
			tail.next=node;
		node.prev=tail;
			tail=node;
		
	}
	/**
	 * remove first element in the list
	 * @return removed ele
	 */
	public T removeFront()
	{
		T item;
		item=head.data;
		head=head.next;
		return item;
	}
	/**
	 * remove last element in the list
	 * @return removed ele
	 */
	public T removeLast()
	{
		T item;
		item=tail.data;
		tail=tail.prev;
		return item;
	}
	/**
	 * show list in forward way
	 */
	public void showForward()
	{
		Node<T> n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	/**
	 * display list in backward direction
	 */
	public void showBackward()
	{
		Node<T> n=tail;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.prev;
		}
	}
	/**
	 * check the list is empty or not
	 * @return
	 */
	public boolean isEmpty()
	{
		return head==null;
	}
	/**
	 * return the size of the list
	 * @return size of list
	 * @param args
	 */
	public int size()
	{
		int size=0;
		Node<T> n=head;
		while(n!=null)
		{
			n=n.next;
			size++;
		}
		return size;
	}
	
}
