package Mediator;

public class MediatorRunner 
{
	public static void main(String[] args) 
	{
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "koti");
		User user2 = new UserImpl(mediator, "guna");
		User user3 = new UserImpl(mediator, "hima");
		User user4 = new UserImpl(mediator, "sai");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}
}
