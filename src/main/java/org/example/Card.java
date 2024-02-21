package org.example;

import com.example.inventory.Product;

import java.util.LinkedList;

public class Card {
    private LinkedList<Product> _allProductsInCard = new LinkedList<>();
    private double _totalPrice;
    //private LinkedList<String> _allItems = new LinkedList<>();


    protected void Add(Product product) {
//    if()
//    {
//
//    }
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
    public void setProductsToCard(LinkedList<Product> products){
        _allProductsInCard.addAll(products);
    }
    protected void removeProductsFromCard(Product product){
        _allProductsInCard.remove(product);
    }

//    public void OrderItemsFromCard() {
//        if (!_allProductsInCard.isEmpty())
//        {
//            initOrderList();
//            System.out.print("All your items in the card :");
//            for (String item : _allItems) {
//                System.out.print("\t" + item);
//            }
//            System.out.println("\nThe amount of your order :" + _totalPrice);
//            clearCard();
//        }
//        else System.out.println("Your card is empty try to add some items");

//    }
//
//    private void initOrderList() {
//        for (Product item : _allProductsInCard) {
//            _totalPrice += item.getPrice();
//            _allItems.add(item.getName());
//        }
//    }
//
//    private void clearCard()
//    {
//        _allItems.clear();
//        _totalPrice=0;
//        _allProductsInCard.clear();
//    }

}