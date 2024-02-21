package org.example;

import com.example.inventory.Inventory;

public class Initialization {

    public static void InitProducts()
    {
        Inventory inventory = new Inventory();
        inventory.AddProduct(2, "egg", 12345.1, "10 eggs", Category.PRODUCTS);
        inventory.AddProduct(32, "milk", 120.24, "2L", Category.PRODUCTS);
        inventory.AddProduct(65, "ring", 1227.32, "Made of silver", Category.ACCESSORIES);
        inventory.AddProduct(9, "cream", 125.743, "For dry skin", Category.BEAUTY);
        inventory.AddProduct(1, "ball", 546.54, "Small ball for cats", Category.PET_SUPPLIES);
        inventory.AddProduct(2, "tomato", 527.34, "2400 gr", Category.PRODUCTS);
    }
}
