
public class DeckOfCardsController 
{
	public static void main(String[] args) 
	{
		MethodsForController m=new MethodsForController();
		System.out.println("after set cards to 4 players");
		m.setcardsToPlayers();
		m.sortcardsqueue();
		System.out.println();
		System.out.println();
		System.out.println("after sort the cards for 4 players");
		m.displaysortcards();
	}
}
