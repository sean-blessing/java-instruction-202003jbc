package ui;

import java.util.HashMap;
import java.util.Map;

import business.Product;

public class MapDemoApp {

	public static void main(String[] args) {
		System.out.println("Create a HashMap!");
		Product p1 = new Product("java","Murach's Java Programming",57.50);
		Product p2 = new Product("html","Murach's HTML",52.99);
		Product p3 = new Product("mysql","Murach's MySQL",54.50);

		HashMap<String, Product> productMap = new HashMap<>(); 
		productMap.put("java", p1);
		productMap.put(p2.getCode(), p2);
		productMap.put(p3.getCode(), p3);
		
		String code = "html";
		System.out.println("product retrieved: "+productMap.get(code));
		
		System.out.println("Entry set:");
		for (Map.Entry product: productMap.entrySet()) {
			System.out.println("Product Entry:  key - "+product.getKey()+
							   ", value - "+product.getValue());			
		}
	}
	
	
	
	
	
	
	
	
	

}
