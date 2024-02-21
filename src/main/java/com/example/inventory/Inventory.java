package com.example.inventory;

import org.example.Card;
import org.example.Category;

import java.util.LinkedList;

public class Inventory extends Product {
    private static LinkedList<Product> _products = new LinkedList<>();
    private static Card card = new Card();

    public void AddProduct(int id, String name, double price, String description, Category category) {
        Product product = new Product();

        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setCategory(category);

        _products.add(product);
    }

    public LinkedList<Product> SearchWithCategories(String str) {
        LinkedList<Product> searchedProducts = new LinkedList<>();
        for (Product item : _products) {
            if (item.getName().equalsIgnoreCase(str)) {
                searchedProducts.add(item);
            }
            if (item.getCategory().toString().equalsIgnoreCase(str)) {
                searchedProducts.add(item);
            }
        }
        return searchedProducts;
    }
    public Product Search(String str)
    {
        for (Product item : _products) {
            if (item.getName().equalsIgnoreCase(str)) {
                return item;
            }
        }
        return null;

    }

    public LinkedList<Product> getAllProducts() {
        return _products;
    }



    public void RemoveProductFromCard() {

    }

    ;

}
