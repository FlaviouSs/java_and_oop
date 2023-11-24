package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		/*
		list.removeIf(new ProductPredicate()); (Implementing interface Predicate in ProductPredicate)
		list.removeIf(Product::staticProductPredicate); (Implementing static method in Product)
		list.removeIf(Product::nonStaticProductPredicate); (Implementing regular method in Product)
		Predicate<Product> pred = p -> p.getPrice() >= 100.00; (Creating variable with lambda expression)
		*/
		
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
