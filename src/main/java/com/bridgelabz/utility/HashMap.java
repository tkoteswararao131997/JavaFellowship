package com.bridgelabz.utility;

public class HashMap<T> 
{
	Node<T> head;
	Node<T> a[]=new Node[11];
	public void add(T data)
	{
		int index=(int)data%11;
		if(a[index]==null)
		{
			a[index]=new Node(data);
		}
		else
		{
			Node<T> n=a[index];
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=new Node(data);
		}
	}
	public void show()
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=null)
			{
				Node<T> temp=a[i];
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
			System.out.println();
		}
	}
}
