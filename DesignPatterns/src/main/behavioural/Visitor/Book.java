package Visitor;

public class Book implements ItemElement
{
	private int price;
	private String isbnNumber;
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) 
	{
		return visitor.visit(this);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
}
