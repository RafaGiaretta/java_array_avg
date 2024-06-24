package array_products;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class application {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of products: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];	
		double averaged, sum =0 ;

		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Enter first product name: ");
			String name = sc.nextLine();			
			System.out.println("Enter first product price: ");
			double price = sc.nextDouble();
			sum += price;
			vect[i] = new Product(name,price);

		}
		
		for (int i = 0; i < vect.length; i++) {
			int count = i+1;
			System.out.println(count + "st Product: " + vect[i].getName() + "\nPrice: $" + vect[i].getPrice());
			
		}
		
		averaged = sum/n;
		
		System.out.printf("AVERAGED PRICE: $%.2f", averaged);
		
		
		sc.close();
	}

}
