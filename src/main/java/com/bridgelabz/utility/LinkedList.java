package com.bridgelabz.utility;

public class LinkedList<T> {
	Node<T> head;
	
	/**
	 * adding data to linked list
	 * @param input
	 */
	public void add(T input) {

		if (head == null) {
			head = new Node<T>(input);
			return ;
		}

		else {
			Node<T> newNode = new Node<T>(input);
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
			newNode.next = null;
		}
	}
	/**
	 * pop the last element in the list
	 */
	public T pop()
	{
		T item;
		if(isEmpty()==false)
		{
		if(head.next==null)
		{
			item=(T)head.data;
			head=null;
			return item;
		}
		else
		{
			Node<T> n=head;
			Node<T> pre=null;
			while(n.next!=null)
			{
				pre=n;
				n=n.next;
			}
			item=(T)pre.next.data;
			pre.next=null;
		}
		return item;
		}
		else
			System.out.println("list is empty");
		return null;
	}
	/**
	 * removing particular element
	 * @param item
	 */
	public void remove(T item)
	{
		if(head.data==item)
		{
			head=head.next;
		}
		else
		{
			Node<T> n=head;
			Node<T> pre=null;
			while(n.next!=null)
			{
				if(n.next.data==item)
					break;
				n=n.next;
			}
			pre=n.next;
			n.next=pre.next;
			
			
		}
	}
	/**
	 * display linkedlist
	 */
	public void show()
	{
		Node<T> n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	/**
	 * search elememt is present in linked list or not
	 * @param item
	 * @return true or false
	 */
	public boolean search(T item)
	{
		if(head.data.equals(item))
			return true;
		Node<T> n=head;
		while(n.next!=null)
		{
			if(n.next.data.equals(item))
				return true;
			n=n.next;
		}
		return false;
	}
	/**
	 * checking linkedlist is empty or not
	 * @return true or false
	 */
	public boolean isEmpty()
	{
		return head==null;
	}
	/**
	 * finding the size of linkedlist
	 * @return size
	 */
	public int size()
	{
		int size=0;
		if(head==null)
			return size;
		else
		{
			Node<T> n=head;
			while(n!=null)
			{
				size++;
				n=n.next;	
			}
		}
		return size;
	}
	/**
	 * finding the index of particula item in the list
	 * @param item
	 * @return index position
	 */
	public int index(T item)
	{
		int index=1;
		if(head.data.equals(item))
			return 0;
		else
		{
			Node<T> n=head;
			while(n.next!=null)
			{
				if(n.next.data.equals(item))
					return index;
				n=n.next;
				index++;
			}
		}
		return -1;
	}
	/**
	 * insert item at particular index
	 * @param pos
	 * @param item
	 */
	public void insert(int pos,T item)
	{
		Node<T> temp=null;
		if(pos==0)
		{
			temp=head;
			head=new Node<T>(item);
			head.next=temp;
		}
		else
		{
			Node<T> node=new Node<T>(item);
			Node<T> n=head;
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			Node<T> temp2=n.next;
			n.next=node;
			n.next.next=temp2;
		}
	}
	/**
	 * pop the element based on particular index
	 * @param pos
	 * @return popped element
	 */
	public T pop(int pos)
	{
		T item;
		if(isEmpty()==false)
		{
		if(pos==0)
		{
			item=head.data;
			head=head.next;
			return item; 
		}
		else
		{
			Node<T> n=head;
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			item= n.next.data;
			n.next=n.next.next;
		}
		return item;
		}
		else
		{
			System.out.println("stack is empty");
		}
		return null;
	}
	public static void main(String[] args) 
	{
		LinkedList<String> l= new LinkedList<String>();
		l.add("koti");
		l.add("firoz");
		l.add("karim");
		l.add("sai");
		l.add("guna");
		System.out.println(l.search("guna"));
	}
}


