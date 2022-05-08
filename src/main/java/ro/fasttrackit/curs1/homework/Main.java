package ro.fasttrackit.curs1.homework;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Lenovo", 299, Collections.singletonList(Category.ELECTRONICS), "Laptop with Windows for home usage.");

        String category = product1.getCategories().toString();

        System.out.println("Product name: " + product1.getName());
        System.out.println("Product price: " + product1.getPrice());
        System.out.println("Product category: " + category.substring(1, category.length() - 1));
        System.out.println("Product description: " + product1.getDescription() + "\n");

        Product product2 = new Product("Leather Jacket", 59, Collections.singletonList(Category.CLOTHES), "Fancy leather jacket.");

        String category2 = product2.getCategories().toString();

        System.out.println("Product name: " + product2.getName());
        System.out.println("Product price: " + product2.getPrice());
        System.out.println("Product category: " + category2.substring(1, category2.length() - 1));
        System.out.println("Product description: " + product2.getDescription() + "\n");

        Product product3 = new Product("Apple", 5, Collections.singletonList(Category.FOOD), "Apple for eating, not Apple for coding.");

        String category3 = product3.getCategories().toString();

        System.out.println("Product name: " + product3.getName());
        System.out.println("Product price: " + product3.getPrice());
        System.out.println("Product category: " + category3.substring(1, category3.length() - 1));
        System.out.println("Product description: " + product3.getDescription() + "\n");

        Product product4 = new Product("DYI", 5, Collections.singletonList(Category.DYI), "I don't know what DYI means.");

        String category4 = product4.getCategories().toString();

        System.out.println("Product name: " + product4.getName());
        System.out.println("Product price: " + product4.getPrice());
        System.out.println("Product category: " + category4.substring(1, category4.length() - 1));
        System.out.println("Product description: " + product4.getDescription() + "\n");
    }
}
