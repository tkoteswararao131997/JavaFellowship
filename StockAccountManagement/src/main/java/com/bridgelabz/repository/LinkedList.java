package com.bridgelabz.repository;

public class LinkedList<T> 
{
	private class Node<T>
	{
		T data;
		Node next;
		public Node(T d)
		{
			data=d;
		}
	}
	Node[] arr=new Node[100];
	public void add(T data,int index)
	{
		boolean b=false;
		if(arr[index]==null)
		{
			arr[index]=new Node(data);
		}
		else
		{
			Node n=arr[index];
			while(n.next!=null)
			{
				if(n.data.equals(data))
				{
					b=true;
					break;
				}
				n=n.next;
			}
			if(b==false)
			n.next=new Node(data);
		}
	}
	public void show()
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]!=null)
			{
				Node n=arr[i];
				while(n!=null)
				{
					System.out.print(n.data+" ");
					n=n.next;
				}
				System.out.println();
			}
		
		}
	}
	public void remove(T item)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i].data.equals(item))
			{
				arr[i]=null;
				break;
			}
		}
	}
	public Object indexstart(int j)
	{
		return arr[j].data;
	}
}
