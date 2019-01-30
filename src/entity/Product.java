package entity;

//public class Product implements Comparable<Product> {
public class Product  {
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	/* When Comparable is implemented 
	 * @Override
	/*public int compareTo(Product other) {		
		return name.toUpperCase().compareTo(other.name.toUpperCase());
	}*/
}
