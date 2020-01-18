package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Queue;

public class CalenderQueue
{
	public static void main(String[] args) 
	{
		Queue<Character> q=new Queue<Character>();
		String s="smtwtfs";
		for (int i = 0; i < s.length(); i++)
		{
			q.enqueue(s.charAt(i));
		}
		q.show();
	}
}