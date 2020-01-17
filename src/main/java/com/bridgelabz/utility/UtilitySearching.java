package com.bridgelabz.utility;

public class UtilitySearching 
{
	/**
	 * Binarysearch to find index for integer array
	 * @param a
	 * @param start
	 * @param last
	 * @param ele
	 * @return
	 */
	public static int binarysearchint(int a[],int start,int last,int ele)
	{
		if(start<last)
		{
			int mid=(start+last)/2;
			if(a[mid]==ele)
				return mid;
			else if(a[mid]>ele)
				binarysearchint(a,start,mid,ele);
			else
				binarysearchint(a,mid+1, last, ele);
		}
		return -1;
	}
	/**
	 * Binary search for char array
	 * @param a
	 * @param start
	 * @param last
	 * @param 
	 * @return
	 */
	public static int binarysearchchar(char a[],int start,int last,char ele)
	{
		if(start<last)
		{
			int mid=(start+last)/2;
			if(a[mid]==ele)
				return mid;
			else if(a[mid]>ele)
				binarysearchchar(a,start,mid,ele);
			else
				binarysearchchar(a,mid+1, last,ele );
		}
		return -1;
	}
	public static int linearsearchint(int a[],int ele)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==ele)
				return i;
		}
		return -1;
	}
}
