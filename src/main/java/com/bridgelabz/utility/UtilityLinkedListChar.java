package com.bridgelabz.utility;

public class UtilityLinkedListChar 
{
	UtilityLinkedListChar next;
	UtilityLinkedListChar head;
	char data;
	public void insert(char ch)
	{
		UtilityLinkedListChar node=new UtilityLinkedListChar();
		node.data=ch;
		if(head==null)
			head=node;
		else
		{
			UtilityLinkedListChar n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		UtilityLinkedListChar n=head;
		while(n!=null)
		{
			System.out.println(n.data+" "+n.next);
			n=n.next;
		}
	}
	public void delete()
	{
		int i=index();
		if(i==0)
			head=head.next;
		else
		{
			UtilityLinkedListChar n=head;
			UtilityLinkedListChar n1=null;
			for(int j=0;j<i-1;j++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	public int size()
	{
		UtilityLinkedListChar n=head;
		int i=0;
		while(n!=null)
		{
			n=n.next;
			i++;
		}
		return i;
	}
	public int index()
	{
		int i=0;
		if(head!=null)
		{
			UtilityLinkedListChar n=head;
			while(n.next!=null)
			{
				i++;
				n=n.next;
			}
		}
		return i;
	}
	public static void main(String[] args) 
	{
		UtilityLinkedListChar l=new UtilityLinkedListChar();
		l.insert('a');
		l.insert('b');
		l.insert('c');
		l.delete();
		l.insert('d');
		l.show();
	}
}
