package business;
import java.text.NumberFormat;

public class Product implements Cloneable, Comparable {
	// 1) define some instance variables
	private String code;
	private String description;
	private double price;
	private static int numberOfObjects;
	
	// 2) define constructor(s)
	// empty / default constructor
	public Product() {
		// explicitly initialize variables
		code = "";
		description = "";
		price = 0;
		numberOfObjects++;
	}

	// fully loaded constructor (all variables)
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
		numberOfObjects++;
	}
	
	// 3) define getters/setters
	public String getCode() {
		return code;
	}
	
	public void setCode(String cd) {
		code = cd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(price);
	}

	// 4) (optional) toString()
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + getPriceFormatted() + 
				", # of objects="+numberOfObjects+"]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Object arg0) {
		// tell Java how to copare products - code
		// compareTo needs to return either -1, 0, or 1
		Product pdt = (Product)arg0;
		return code.compareTo(pdt.getCode());
	}
	
	
	
	
	
	
	
	
}
