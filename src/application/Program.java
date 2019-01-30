package application;

import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> listProducts = new ArrayList<>();
		
		listProducts.add(new Product("REFRIGERATOR", 900));
		listProducts.add(new Product("COOKER", 400));
		listProducts.add(new Product("OVEN", 500));
		
		/* First option: "Easy way" of doing sort operation.In this option the ProductComparator is not necessary
		 * 
		 * Collections.sort(listProducts); //the list type should implement Comparable interface. 
		 * */
				
		/* Second option: Better way of doing sort operation because its implementation is in a class 
		 * designed just to do comparison. In this option the ProductComparator is necessary
		 *  
		 * listProducts.sort(new ProductComparator());
		 * */
		
		/* Third option: Anonymous class. In this way the ProductComparator class is not necessary.
		 * The comparator class is defined and stored in the productComparator variable.
		 * 		
		 *Comparator<Product> productComparator = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}			
		};
		 * listProducts.sort(productComparator);
		 * */
		
		/*
		* Fourth option: Anonymous function with lambda expression. In this option the ProductComparator is not necessary  
		* Comparator<Product> productComparator = (p1, p2) -> {
		*	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		* };
		*
		* The above result can be achivied with a different implementation. Shorter as below
		* Comparator<Product> productComparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		listProducts.sort(productComparator);
		* */
		
		/* Finnaly, Anonymous function with lambda expression as parameter. In this option the ProductComparator is not necessary */
		/* listProducts.sort((p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		});*/	
		
		//Final result with the shortest version.  			
		listProducts.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
						
		for (Product p : listProducts)
			System.out.println(p.getName());
		
	}

}
