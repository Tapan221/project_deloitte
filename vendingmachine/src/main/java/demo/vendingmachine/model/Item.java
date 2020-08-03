package demo.vendingmachine.model;

public enum Item{ 
	
	CHOKOLATE("chocolate", 50), CANDY("candy", 25), COKE("coke", 25); 
	private String name; 
	private int price; 
	
	private Item(String name, int price){ 
		this.name = name; this.price = price; 
	} 
	
	public String getName(){ 
		return name; 
	} 
	
	public long getPrice(){ 
		return price; 
	} 
}


