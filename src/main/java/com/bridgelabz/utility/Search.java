package com.bridgelabz.utility;

public class Search<T extends Comparable<T>>
{
	public int linearsearch(T a[],T ele)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if((a[i]).equals(ele))
				return i;
		}
		return -1;
		
	}
	public int binarysearch(T a[],T ele,int start,int end)
	{
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid].equals(ele)) 
			{
				return mid;
			}
			else if(a[mid].compareTo(ele)<0)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Search<Character> s=new Search<Character>();
		Character a[]= {'a','b','c','d'};
	
		System.out.println(s.binarysearch(a, 'd', 0, 3));
	}
}
