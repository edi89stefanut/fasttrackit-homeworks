package ro.fasttrackit.curs1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class Product {

    private final String name;
    private final int price;
    private final List<Category> categories;
    private final String description;

    public Product(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
        this.categories = new ArrayList<>(categories);
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && name.equals(product.name) && categories.equals(product.categories) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }
}
