
package com.bridgelabz.utility;
import java.util.*;
/**Writing all my logics of all classes in this class
 * 
 * @author KOTI
 * 
 */
public class UtilityLogics {
	/**
	 * by using this method we can call user
	 * parameters:String
	 * return String
	 */
	public static String replaceString(String str) {
		String original = "Hello <<username>>,how are you";
		original = original.replace("<<username>>", str);
		return original;
	}

	/**
	 * calculating the head by tail percentage
	 * @param flips
	 * @return double per
	 */
	public static double flipcoinper(int flips) {
		double heads = 0, tails = 0;
		while (flips > 0) {
			double val = Math.random();
			if (val > 0.5) {
				heads++;
			} else {
				tails++;
			}
			flips--;
		}
		double per = (heads / tails) * 100;
		return per;
	}

	/**
	 * check whether the given year is leap year or not
	 * @param year
	 * @return boolean year 
	 */
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}

	/**
	 * calculating the power of 2
	 * @param pow
	 * @return power value
	 */
	public static long powerof2(int pow) {
		long mul = 1;
		while (pow > 0) {
			mul = 2 * mul;
			pow--;
		}
		return mul;
	}

	/**
	 * find the harmonic range for particular number
	 * @param range
	 * @return harmonic range
	 */
	public static double harmonic(int range) {
		double harmonic = 0.0;
		while (range > 0) {
			harmonic = harmonic + (1.0 / range);
			range--;
		}
		return harmonic;
	}

	/**
	 * find the prime factors for the number
	 * @param n
	 * @return l which stores prime values
	 */
	public static ArrayList<Integer> primefactorization(int n) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		while (n > 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					l.add(i);
					n = n / i;
					break;
				}
			}
		}
		return l;
	}

	/**
	 * find win percentage wins and loss percentage based upon the stake and goal
	 * @param stake
	 * @param goal
	 * @return wins,winper,lossper through Hashmap
	 */
	public static HashMap<String, Object> gambler(int stake, int goal) 
	{
		HashMap<String, Object> l = new HashMap();
		double wins = 0, losses = 0, fairs = 0;
		while (stake != 0 && goal != stake) {
			double val = Math.random();
			if (val >= 0.5) {
				wins++;
				stake++;
			} else {
				losses++;
				stake--;
			}
			fairs++;
		}
		double winper = wins / fairs * 100;
		double lossper = losses / fairs * 100;
		l.put("wins", wins);
		l.put("winper", winper);
		l.put("lossper", lossper);

		return l;
	}

	/**
	 * printwriter 2D array
	 * @param rows
	 * @param cols
	 * @return 2D array
	 */
	public static int[][] array2D(int rows, int cols)
	{
		int a[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		return a;
	}

	/**
	 * find n no.of steps for finding N distinct coupon numbers
	 * @param N
	 * @return n means count
	 */
	public static int randomCoupons(int N) {
		int count = 0;
		Random r = new Random();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			int val = r.nextInt(10);
			if (i == 0) {
				a[i] = val;
			} else {
				for (int j = 0; j < i; j++) {
					if (val != a[j]) {
						a[i] = val;
					} else {
						i--;
						break;
					}
				}
			}
			count++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return count;
	}

	/**
	 * find the distance
	 * @param x
	 * @param y
	 * @return distance
	 */
	public static double distance(double x, double y) {
		double distance = Math.pow((x * x + y * y), 0.5);
		return distance;
	}

	/**
	 * sum of three numbers in an array
	 * @param a
	 * @return sum numbers through ArrayList
	 */
	public static ArrayList<Integer> sumOfThree(int a[]) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						l.add(a[i]);
						l.add(a[j]);
						l.add(a[k]);
					}
				}
			}
		}
		return l;
	}

	/**
	 * taking values for array through dynamic manner
	 * @return array
	 */
	public static int[] randomArray() {
		int n = UtilityScanner.readInteger();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = UtilityScanner.readInteger();
		}
		return a;
	}
	/**
	 * find the roots for the quadratic equation
	 * @param a
	 * @param b
	 * @param c
	 * @return root
	 */
	public static double quadraticroot1(int a, int b, int c) {
		double root1 = 0.0;
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / 2 * a;
		} else if (delta == 0) {
			root1 = -b / 2 * a;
		}
		return root1;

	}
	/**
	 * find roots for quadratic equation
	 * @param a
	 * @param b
	 * @param c
	 * @return root2
	 */
	public static double quadraticroot2(int a, int b, int c) {
		double root2 = 0.0;
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			root2 = (-b - Math.sqrt(delta)) / 2 * a;
		} else if (delta == 0) {
			root2 = -b / 2 * a;
		}
		return root2;

	}
	/**
	 * findng the value for windchill based upon the temperature an spedd values
	 * @param t
	 * @param v
	 * @return double value for windchill
	 */
	public static double windchill(double t, double v) {
		double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return w;

	}
	/**
	 * find difference between two timings
	 * @param StartTime
	 * @param EndTime
	 * @return diff time
	 */
	public static String stowatch(String StartTime, String EndTime) {
		String sh = "", sm = "", ss = "";
		for (int i = 0; i < StartTime.length(); i++) {
			if (i < 2) {
				sh = sh + StartTime.charAt(i);
			}
			if (i > 2 && i < 5) {
				sm = sm + StartTime.charAt(i);
			}
			if (i > 5) {
				ss = ss + StartTime.charAt(i);
			}
		}
		int shrs = Integer.parseInt(sh) * 3600;
		int smins = Integer.parseInt(sm) * 60;
		int ssecs = Integer.parseInt(ss);
		int totals = shrs + smins + ssecs;
		String eh = "", em = "", es = "";
		for (int i = 0; i < EndTime.length(); i++) {
			if (i < 2) {
				eh = eh + EndTime.charAt(i);
			}
			if (i > 2 && i < 5) {
				em = em + EndTime.charAt(i);
			}
			if (i > 5) {
				es = es + EndTime.charAt(i);
			}
		}
		int ehrs = Integer.parseInt(eh) * 3600;
		int emins = Integer.parseInt(em) * 60;
		int esecs = Integer.parseInt(es);
		int totale = ehrs + emins + esecs;
		int diff = Math.abs(totals - totale);
		int diffhrs = diff / 3600;
		int diffmins = (diff % 3600) / 60;
		int diffsecs = (diff % 60);
		String difference = diffhrs + ":" + diffmins + ":" + diffsecs;
		return difference;
	}
	/**
	 * Tic Tac Toe which is used to find who is the winner user or system
	 */
	public static void tictactoe() 
	{
		char game[][]=new char[3][3];
		Random r=new Random();
		int count=0;
		boolean rb=false,cb=false,db=false;
		for (int i = 0; i < game.length; i++) 
		{
			for (int j = 0; j < game.length; j++) 
			{
				int row=r.nextInt(3);
				int col=r.nextInt(3);
				if(game[row][col]!='O' && game[row][col]!='X')
				{
					if(count%2==0)
					{
						game[row][col]='O';
						rb=checkrow(game);
						cb=checkcol(game);
						db=checkdiag(game);
						if(rb==true || cb==true || db==true)
						{
							System.out.println("you won");
							break;
						}
					}
					else
					{
						game[row][col]='X';
						rb=checkrow(game);
						cb=checkcol(game);
						db=checkdiag(game);
						if(rb==true || cb==true || db==true)
						{
							System.out.println("computer won");
							break;
						}
					}
					count++;
				}
				else
					j--;
		   }
			if(rb==true || cb==true || db==true)
			{
				break;
			}
		}
		if(rb==false && cb==false && db==false)
		{
			System.out.println("draw");
		}
		display(game);
		
	}
	/**
	 * tictactoe diagonal checking
	 * @param game
	 * @return boolean value
	 */
	private static boolean checkdiag(char[][] game)
	{
		int rud=0,rcd=0,lud=0,lcd=0;
		for (int i = 0; i < game.length; i++) 
		{
			for (int j = 0; j < game.length; j++) 
			{
				if(i==j)
				{
					if(game[i][j]=='O')
						rud++;
					if(game[i][j]=='X')
						rcd++;
				}
				if(i-j==2 || i-j==-2 || i==1 && j==1)
				{
					if(game[i][j]=='O')
						lud++;
					if(game[i][j]=='X')
						lcd++;
						
				}
			}
		}
		if(rud==3 || rcd==3 || lud==3 || lcd==3)
			return true;
		return false;
	}

	/**
	 * tictactoe column checking
	 * @param game
	 * @return boolean value
	 */
	private static boolean checkcol(char[][] game) 
	{
		for (int i = 0; i < game.length; i++) 
		{
			int cu=0,cc=0;
			for (int j = 0; j < game.length; j++) 
			{
				while(j<3)
				{
					if(game[j][i]=='O')
						cu++;
					if(game[j][i]=='X')
						cc++;
					j++;
				}
			}
			if(cu==3 || cc==3)
				return true;
		}
		return false;
	}
	/**
	 * tictactoe ro checking
	 * @param game
	 * @return boolean value
	 */
	private static boolean checkrow(char[][] game) 
	{
		for (int i = 0; i < game.length; i++) 
		{
			int ru=0,rc=0;
			for (int j = 0; j < game.length; j++) 
			{
				if(game[i][j]=='O')
					ru++;
				if(game[i][j]=='X')
					rc++;
			}
			if(ru==3 || rc==3)
				return true;
		}
			return false;
	}
	/**
	 * diaplay an array
	 * @param game
	 */
	private static void display(char[][] game) 
	{
		for (int i = 0; i < game.length; i++) 
		{
			for (int j = 0; j < game.length; j++) 
			{
				System.out.print(game[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * find all permutations of a word through recursion
	 * @param word
	 * @param start
	 * @param end
	 */
	 public static void recursionWords(String word, int start, int end) 
	 {
		 if(start==end)
			 System.out.println(word);
		 else
		 {
			 for(int i=start;i<=end;i++)
			 {
				 word=swap(word,start,i);
				 recursionWords(word, start+1, end);
				 word=swap(word,start,i);
				 
			 }
		 }
	}
	/**
	 * swaping condition for recursion words
	 * @param word
	 * @param start
	 * @param i
	 * @return string word
	 */
	private static String swap(String word, int start, int i)
	{
		char temp;
		char a[]=word.toCharArray();
		temp=a[start];
		a[start]=a[i];
		a[i]=temp;
		return String.valueOf(a);
	}
	/**
	 * find all permutations of a word through iteartion
	 * @param word
	 * @return string[] with words
	 */
	public static String[] iterateWords(String word) 
	{
		char a[]=word.toCharArray();
		int fact=1,val=1;
		while(fact<=a.length)
		{
			val=val*fact;
			fact++;
		}
		fact=val/a.length;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			int size=a.length-1;
			for (int j = fact; j > 0; j--) 
			{
				char ch=a[size];
				a[size]=a[size-1];
				a[size-1]=ch;
				--size;
				if(size==1)
					size=a.length-1;
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[k]);
				}
				System.out.println();
			}
			count++;
			if(count!=a.length)
			{
			char ch=a[count];
			a[count]=a[0];
			a[0]=ch;
			}
			
		}
		return null;
	}
	/**
	 * search a word is present in the file or not using binary search
	 * @param words[]
	 * @param input
	 * @param j 
	 * @param i 
	 * return boolean value of word present or not
	 */

	public static boolean fileBinarySearch(String[] words, String input, int i, int j) 
	{
		int mid=(i+j)/2;
		System.out.println(mid+" "+words[mid]);
		if(words[mid].equalsIgnoreCase(input))
			return true;
		else if((int)words[mid].charAt(0) > (int)input.charAt(0))
		{
			fileBinarySearch(words,input,i,mid);
		}
		else
			fileBinarySearch(words, input, mid+1, j);
		return false;
	}
	/**
	 * sort the words using insertion sort technique
	 * @param s
	 * @return string[] words after sorting
	 */
public static String[] insertionsort(String[] s) 
{
	for (int i = 1; i < s.length; i++) 
	{
		int j=i;
		while(j>0)
		{
			if(s[j].length()<s[j-1].length())
			{
				s=swap(s,j);
				j--;
			}
			else if(s[j].length()==s[j-1].length())
			{
				int k=0;
				while(k<s[j].length())
				{
					if(s[j].charAt(k)<s[j-1].charAt(k))
					{
						swap(s,j);
						break;
					}
					if(s[j].equals(s[j-1]))
						break;
					if(s[j].charAt(k)==s[j-1].charAt(k))
					{
						k++;
					}
					if(s[j].charAt(k)>s[j-1].charAt(k))
					{
						break;
					}
					
				}
				j--;
			}
				
			else
				break;
		}
	}
		
	return s;
}
	/**
	 * swap characters
	 * @param s
	 * @param j
	 * @return string[] after swap the characters
	 */
	private static String[] swap(String[] s, int j) 
	{
		String temp=s[j];
		s[j]=s[j-1];
		s[j-1]=temp;
		return s;
	}
	/**
	 * print string array
	 * @param s
	 */
	public static void display(String[] s) 
	{
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}
		
	}
	/**
	 * sort the numbers using bubble sort
	 * @param nums
	 * @return integer []
	 */
	public static int[] bubbleSort(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j =0; j < nums.length-i-1; j++)
			{
				if(nums[j]>nums[j+1])
				{
					nums=swap(nums,j);
				}
			}
		}
		
		return nums;
	}
	/**
	 * swap nums
	 * @param nums
	 * @param j
	 * @return integer[] after swaping
	 */
	private static int[] swap(int[] nums, int j)
	{
		int temp=nums[j+1];
		nums[j+1]=nums[j];
		nums[j]=temp;
		return nums;
	}
	/**
	 * print number array
	 * @param nums
	 */
	public static void iterateArray(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
	}
	/**
	 * used for mergesort to divide the array into single element
	 * @param s
	 * @param start
	 * @param end
	 */
	public static void divide(String[] s, int start, int end) 
	{
		if(start<end)
		{
			display(s);
			int mid=(start+end)/2;
			divide(s,start,mid);
			divide(s,mid+1,end);
			merge(s,start,mid,end);
		}
	}
	/**
	 * used in mergesort for combining the elements 
	 * @param s
	 * @param start
	 * @param mid
	 * @param end
	 */
	private static void merge(String[] s, int start, int mid, int end) 
	{
		int n1=mid-start+1;
		int n2=end-mid;
		String s1[]=new String[n1];
		String s2[]=new String[n2];
		for (int i = 0; i < s1.length; i++) 
		{
			s1[i]=s[start+i];
		}
		for (int i = 0; i < s2.length; i++) 
		{
			s2[i]=s[mid+1+i];
		}
		int i=0,j=0,k=start;
		while(i<n1 && j<n2)
		{
			if(s1[i].length()>s2[j].length())
			{
				s[k]=s2[j];
				j++;
				k++;
			}
			else if(s1[i].length()==s2[j].length())
			{
				int m=0;
				while(m<s1[i].length())
				{
					if(s1[i].charAt(m)>s2[j].charAt(m))
					{
						s[k]=s2[j];
						j++;
						k++;
						break;
					}
					if(s1[i].charAt(m)<s2[j].charAt(m))
					{
						s[k]=s1[i];
						i++;
						k++;
						break;
					}
					else 
					{
					System.out.println("while");
					 m++;
					}
				}
			}
			else
			{
				s[k]=s1[i];
				i++;
				k++;
			}
		}
		while(i<n1)
		{
			s[k]=s1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			s[k]=s2[j];
			j++;
			k++;
		}
		
	}
	/**
	 * check whether the two strings are palindrome are not
	 * @param s1
	 * @param s2
	 * @return true or false
	 */
	public static boolean isAnagram(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(a[j]<a[j-1])
				{
					char temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					j--;
				}
				else
					break;
			}
		}
		for(int i=1;i<b.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(b[j]<b[j-1])
				{
					char temp=b[j];
					b[j]=b[j-1];
					b[j-1]=temp;
					j--;
				}
				else
					break;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	/**
	 * print the prime numbers based upon the range
	 * @param n
	 * @return prime integers []
	 */
	public static int[] primerange(int n) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		for (int i = 2; i < n; i++) 
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				l.add(i);
		}
		int primes[]=new int[l.size()];
		for (int i = 0; i < primes.length; i++) 
		{
			primes[i]=l.get(i);
		}
		return primes;
	}
	/**
	 * display integer array
	 * @param primes
	 */
	public static void display(int[] primes) 
	{
		for (int j = 0; j < primes.length; j++) {
			System.out.print(primes[j]+" ");	
		}
	}
	/**
	 * find the primenumbers which are palindrome and anagram
	 * @param n
	 * @return arraylist[]
	 */
	public static ArrayList primeanapali(int n) 
	{
		boolean ba=false,bp=false;
		ArrayList l=new ArrayList();
		int primes[]=primerange(n);
		for (int i = 0; i < primes.length; i++) 
		{
			for (int j = i+1; j < primes.length; j++) 
			{
					ba=isAnagramInt(primes[i],primes[j]);
					bp=ispalindrome(primes[i],primes[j]);
					if(ba==true && bp==true)
					{
						l.add(primes[i]);
						l.add(primes[j]);
					}	
						
			}
		}
		return l;
	}
	/**
	 * used for checking palindrome or not for two numbers
	 * @param i
	 * @param j
	 * @return true or false
	 */
	private static boolean ispalindrome(int i, int j)
	{
		int mul=0;
		while(i!=0)
		{
			int r=i%10;
			mul=mul*10+r;
			i=i/10;
		}
		if(mul==j)
		{
			return true;
		}
		return false;
	}
	/**
	 * used to check two numbers are anagram or not
	 * @param n1
	 * @param n2
	 * @return true or false
	 */
	public static boolean isAnagramInt(int n1, int n2) 
	{
		ArrayList l1=new ArrayList();
		ArrayList l2=new ArrayList();
		while(n1!=0)
		{
			int r=n1%10;
			l1.add(r);
			n1=n1/10;
		}
		while(n2!=0)
		{
			int r=n2%10;
			l2.add(r);
			n2=n2/10;
		}
		Collections.sort(l1);
		int num1[]=new int[l1.size()];
		for(int i=0;i<num1.length;i++)
		{
			num1[i]=(int)l1.get(i);
		}
		Collections.sort(l2);
		int num2[]=new int[l2.size()];
		for(int i=0;i<num2.length;i++)
		{
			num2[i]=(int)l2.get(i);
		}
		//System.out.println(l1+" "+l2);
		if(num1.length!=num2.length)
			return false;
		for (int i = 0; i < num2.length; i++) 
		{
			if(num1[i]!=num2[i])
				return false;
		}
		return true;
	}
	/**
	 * guess the user number continuosly upto the user number is correct
	 * @param n
	 * @return number
	 */
	public static int guessNumber(int n) 
	{
		int telling=0;
		int result=binarysearchnum(telling,0,n);
		return result;
	}
	/**
	 * used to search the guess number
	 * @param telling
	 * @param start
	 * @param end
	 * @return integer
	 */
	public static int binarysearchnum(int telling,int start,int end) 
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			System.out.println("is this num:"+mid);
			System.out.println("telling");
			telling=UtilityScanner.readInteger();
			if(telling==0)
			{
				System.out.println("mover");
				int mover=UtilityScanner.readInteger();
				if(mover==0)
				{
					binarysearchnum(telling, start, mid);
				}
				if(mover==1)
					binarysearchnum(telling, mid+1, end);
			}
			else
			{
				System.out.println(start+" "+end);
				System.out.println("else"+mid);
				return mid;
			}
		}
		return -1;
	}
	/**
	 * replace the text with name and mobilenumber
	 * @return replaced text
	 */
	public static String messageForm()
	{
		String original="Hello <<name>>, We have your full name as <<full name>> in our system.your contact number is 91-xxxxxxxxxx."+
						"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		String name=UtilityScanner.readString();
		String fullname=UtilityScanner.readString();
		String pno=UtilityScanner.readString();
		String date=UtilityScanner.readString();
		original=original.replaceFirst("<<name>>", name);
		original=original.replaceFirst("<<full name>>", fullname);
		original=original.replaceFirst("xxxxxxxxxx", pno);
		original=original.replace("01/01/2016", date);
		return original;
	}
	/**
	 * check how many notes required for the given money
	 * @param notes
	 * @param amount
	 * @return notes
	 */
	public static long vendingmachine(int[] notes,long amount) 
	{
		
		long numnotes=0,result=0,change=0,i=1;
		int count=notes.length-1;
		while(amount>=1)
		{
			if(amount>=notes[count])
			{
				numnotes=amount/notes[count];
				amount=amount%notes[count];
				if(amount<50 && i!=0)
				{
					change=amount;
					i=0;
				}
				result=result+numnotes;
			}
			else
				count--;
		}
		return result;
	}
	/**
	 * print the day of the week
	 * @param d
	 * @param m
	 * @param y
	 * @return integer of the day
	 */
	public static int dayofweek(int d, int m, int y) 
	{
				int y0 = y -(14 - m) / 12;
				int x = y0 + y0/4 - y0/100 + y0/400;
				int m0 = m + 12 *((14 - m) / 12)- 2;
				int d0 = (d + x + 31*m0 / 12)%7;

		return d0;
	}
	/**
	 * convert fareinheit to celsius
	 * @param f
	 * @return celsius value
	 */
	public static double temperature(double f) 
	{
		double c=(f-32)*5/9; 
		return c;
	}
	/**
	 * print monthly payment of the principle
	 * @param p
	 * @param y
	 * @param r
	 * @return payment in double
	 */
	public static double monthlypayment(double P, double Y, double R) 
	{
		double n=12*Y;
		double r=R/(12*100);
		double a=P*r;
		double b=Math.pow((1+r),-n);
		double payment=a/(1-b);
		return payment;
	}
	/**
	 * find squareroot of a number
	 * @param t
	 * @return rootvalue in double
	 */
	public static double squareroot(double t) 
	{
		double c=t;
		t=(c/t *t)/2;
		double val=Math.abs(t-c/t);
		double epsilon=8.8541878128*13*Math.pow(10, -12)*t;
		System.out.println("epsilon:"+epsilon);
		while(val>epsilon)
		{
			c=t;
			t=(c/t *t)/2;
			val=Math.abs((t-(c/t)));
			System.out.println("val"+val);
		}
		
		return val;
	}
	/**
	 * convert decimal to binary
	 * @param num
	 * @return binary in string
	 */
	public static String tobinary(int num) 
	{
		String s="";
		while(num>=1)
		{
			s=Integer.toString(num%2)+s;
			num=num/2;                                                   
		}
		return s;
	}
	/**
	 * find binarynibble value
	 * @param num
	 * @return integer of that binarynibble
	 */
	public static int binaryNibbles(int num) 
	{
		String s1="",s2="";
		String s=tobinary(num);
		if(s.length()<8)
		{
			int i=s.length();
			while(i!=8)
			{
				s=0+s;
				i++;
			}
		}
		for (int i = 0; i < s.length(); i++) 
		{
			if(i<4)
				s1=s1+s.charAt(i);
			else
			s2=s2+s.charAt(i);
			
		}
		s=s2+s1;
		System.out.println(s);
		int count=0,total=0;
		for(int i=s.length()-1;i>0;i--)
		{
			int mul=1;
			count++;
			
			if(s.charAt(i)=='1' && i==0)
			{
				total=1;
			}
			else if(s.charAt(i)=='1')
			{
				int j=1;
				while(j<count)
				{
					mul=mul*2;
					j++;
				}
				total=total+mul;
			}
		}
		return total;
	}
	/**
	 * print prime numbers in a range in 2D array
	 * @param range
	 * @return integer 2D array
	 */
	public static int[][] PrimeRange2D(int range) 
	{
		int primes[]=UtilityLogics.primerange(range);
		int rows=10,cols=25;
		int primes2D[][]=new int[rows][cols];
		int count=0,inc=100;
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
//				System.out.println(i+" "+j);
				if(count<primes.length)
				{
				if(primes[count]<=inc)
				{
				primes2D[i][j]=primes[count];
				count++;
				}
				}
			}
			inc=inc+100;
			System.out.println();
		}
		return primes2D;
	}
	/**
	 * print anagrams in 2D in particular range
	 * @param anagramprimes
	 * @param primes
	 * @param result
	 * @param count
	 * @return Object array
	 */
	public static Object[] anagramsrange(int[][] anagramprimes, int[] primes, int[] result, int count) 
	{
		for (int i = 0; i < primes.length; i++) 
		{
			for (int j = i+1; j < primes.length; j++) 
			{
				boolean b=UtilityLogics.isAnagramInt(primes[i], primes[j]);
				if(b==true)
				{
					result[count]=primes[i];
					++count;
					result[count]=primes[j];
					++count;
				}
			}
		}
		TreeSet s=new TreeSet();
	   for (int i = 0; i < count; i++) 
	   {
		s.add(result[i]);
	   }
	   Object check[]=s.toArray();
		return check;
	}
}

