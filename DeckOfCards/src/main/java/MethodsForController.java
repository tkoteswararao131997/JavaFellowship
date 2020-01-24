import java.util.Random;

import org.json.simple.JSONObject;

public class MethodsForController implements MethodsInterface
{
	Random r=new Random();
	String suit[]= {"C", "D", "H", "S"};
	String rank[]= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	String players[]= {"p1","p2","p3","p4"};
	String storage[]=new String[36];
	String cards[][]=new String[4][9];
	String sortcards[][]=new String[4][9];
	@Override
	public void setcardsToPlayers() 
	{
		int j=0,k=0;
		while(j<36 || k<36)
		{
			for (int i = 0; i < players.length; i++) 
			{
				String val=getsuit()+getrank();
				boolean b=checkrepeatcard(val,storage,k);
				if(b==true && k<36)
				{
					storage[k]=val;
					k++;
					j++;
				}
				else
				{
					i--;
					j--;
				}
				if(k==36)
					break;
			}
			if(k==36)
				break;
		}
		arrangein2D(storage);
	}
	private boolean checkrepeatcard(String val, String[] storage,int k) 
	{
		for (int i = 0; i <k; i++) 
		{
			if(k==0)
			{
				return true;
			}
			if(storage[i].equals(val))
				return false;
		}
		return true;
	}
	@Override
	public void setPlayersNames() 
	{
		
	}
	@Override
	public String getsuit() 
	{
		int suitindex=r.nextInt(4);
		return suit[suitindex];
	}
	@Override
	public String getrank() 
	{
		int rankindex=r.nextInt(13);
		return rank[rankindex];
	}
	public void arrangein2D(String[] storage) 
	{
		int i=0,j=0,k=0;
		
		while(j<4)
		{
		i=j;
		k=0;
		while(i<storage.length)
		{
			cards[j][k]=storage[i];
			i=i+4;
			k++;
		}
		j++;
		}
		for (int l = 0; l < cards.length; l++) 
		{
			System.out.print(players[l]+"-------->");
			for (int l2 = 0; l2 < 9; l2++) 
			{
				System.out.print(cards[l][l2]+" ");
			}
			System.out.println();
		}
	}
	public void sortcardsqueue() 
	{
		for (int i = 0; i < 4; i++) 
		{
			Queue<String> q=new Queue<String>();
			for (int j = 0; j < 9; j++) 
			{
				q.sortinsert(cards[i][j]);
			}
			for (int j = 0; j < 9; j++) 
			{
				sortcards[i][j]=q.dequeue(0);
			}
		}
	}
	public void displaysortcards() 
	{
		for (int l = 0; l < cards.length; l++) 
		{
			System.out.print(players[l]+"-------->");
			for (int l2 = 0; l2 < 9; l2++) 
			{
				System.out.print(sortcards[l][l2]+" ");
			}
			System.out.println();
		}
	}
}
