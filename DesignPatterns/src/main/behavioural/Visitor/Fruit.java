package Visitor;

public class Fruit implements ItemElement 
{
	private int price;
	private int weight;
	private String name;
	public Fruit(int priceKg, int wt, String nm){
		this.price=priceKg;
		this.weight=wt;
		this.name = nm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
