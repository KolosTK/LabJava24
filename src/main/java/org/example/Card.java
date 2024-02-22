package org.example;

import com.example.inventory.Product;

import java.util.LinkedList;

public class Card {
    private LinkedList<Product> _allProductsInCard = new LinkedList<>();


    protected void Add(Product product) {
        _allProductsInCard.add(product);
    }

    public String toString(Product product) {
        return "id:" + product.getId() +
                "\tname:" + product.getName() +
                "\tprice:" + product.getPrice() +
                "\tdescription: " + product.getDescription();
    }

    public LinkedList<Product> getProductsFromCard() {
        return _allProductsInCard;
    }

    public void setProductsToCard(LinkedList<Product> products) {
        _allProductsInCard.addAll(products);
    }

    protected void removeProductsFromCard(Product product) {
        _allProductsInCard.remove(product);
    }

    public double OrderItemsFromCard() {
        double totalPrice = 0;
        if (!_allProductsInCard.isEmpty()) {

            for (Product item : _allProductsInCard) {
                totalPrice += item.getPrice();
            }
            clearCard();
            return totalPrice;
        }
        return totalPrice;
    }
    private void clearCard() {
        _allProductsInCard.clear();
    }
}