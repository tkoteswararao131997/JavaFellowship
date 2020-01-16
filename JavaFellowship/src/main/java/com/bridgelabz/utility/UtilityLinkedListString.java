package com.bridgelabz.utility;
public class UtilityLinkedListString 
{
	UtilityLinkedListString head;
	UtilityLinkedListString next;
	String data;
	char ch;
	public  UtilityLinkedListString insert(String s)
	{
		UtilityLinkedListString node=new UtilityLinkedListString();
		node.data=s;
		if(head==null)
			head=node;
		else
		{
			UtilityLinkedListString n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		return node;
	}
	public void display(UtilityLinkedListString node)
	{
		UtilityLinkedListString n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public int search(UtilityLinkedListString l,String word) 
	{
		int index=0;
		UtilityLinkedListString n=head;
		while(n!=null)
		{
			if(n.data.equals(word))
				return index;
			n=n.next;
			index++;
		}
		return -1;
	}
	public UtilityLinkedListString delete(int index) 
	{
		UtilityLinkedListString n=new UtilityLinkedListString();
		if(index==0)
			head=head.next;
		else
		{
			n=head;
			UtilityLinkedListString n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			
		}
		return n;	
	}
	public int size(UtilityLinkedListString l)
	{
		UtilityLinkedListString n=head;
		int count=0;
		while(n!=null)
		{
			n=n.next;
			count++;
		}
		
		return count++;
		
		
	}
	public String get(UtilityLinkedListString l, int i)
	{
		UtilityLinkedListString n=head;
		int num=0;
		while(num!=i)
		{
			n=n.next;
			num++;
		}
		System.out.println(n.data);
		String s=n.data;
		return s+" ";
	}
	public void insertAt(String s, UtilityLinkedListString l,int num) 
	{
		UtilityLinkedListString node=new UtilityLinkedListString();
		int j=0;
		node.data=s;
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else if((int)s.charAt(j)<=head.data.charAt(j) )
		{
			node.next=head;
			head=node;
		}
			
		else
		{
			UtilityLinkedListString n=head;
			while(n.next!=null)
			{
				if((int)s.charAt(j)<(int)n.next.data.charAt(j))
				{
					break;
				}
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
			
		}
	}
	
}
