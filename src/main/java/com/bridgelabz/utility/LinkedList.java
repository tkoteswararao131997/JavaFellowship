package com.bridgelabz.utility;

public class LinkedList<T> {
	Node head;
	class Node<T> {
		T data;
		Node next;

		Node(T d) {
			data = d;
		}
	}

	public void add(T input) {

		if (head == null) {
			head = new Node(input);
			return;
		}

		else {
			Node newNode = new Node(input);
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
			newNode.next = null;
		}
	}

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

//	public boolean search(T value) {
//		if (head.data == value)
//			return true;
//		else {
//			LinkedList<T> n = head;
//			while (n != null) {
//				if (n.data == value)
//					return true;
//				n = n.next;
//			}
//		}
//		return false;
//	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

//	public int size() {
//		return size;
//	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("hello");
		l.add("kevin");
		l.add("firoz");
		l.add("hima");
		l.add("bye");
		l.remove();
		l.show();
	}
}
