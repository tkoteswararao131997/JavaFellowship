
public class Queue<T extends Comparable> 
{
	class Node{
		Node next;
		String data;
		Node(String d)
		{
			data=d;
		}
	}
	Node head;
	public void sortinsert(String input)
	{
		if(head==null)
		{
			head=new Node(input);
		}
		else if(input.compareTo(head.data)<0)
		{
			Node n=head;
			head=new Node(input);
			head.next=n;
		}
		else
		{
			Node n=head;
			Node pre=null;
			while(n.next!=null)
			{
				pre=n;
				if(input.compareTo(n.next.data)<0)
				{
					break;
				}
				n=n.next;
			}
			pre=n.next;
			n.next=new Node(input);
			n.next.next=pre;
			
			
		}
		
	}
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	public String dequeue(int index)
	{
		String s="";
		if(index==0)
		{
			s=head.data;
			head=head.next;
			
		}
		return s;
	}
//	public static void main(String[] args) 
//	{
//		Queue<String> q=new Queue<String>();
//		q.sortinsert("adc");
//		q.sortinsert("abg");
//		q.sortinsert("hello");
//		q.sortinsert("bat");
//		q.sortinsert("a");
//		q.sortinsert("adb");
//		q.show();
//	}
}
